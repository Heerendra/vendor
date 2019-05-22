package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VendorDaoImpl;
import pojos.VendorPojo;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/Reg")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VendorDaoImpl dao;
   
	public void init() throws ServletException {
		try {
			dao=new VendorDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException("Error in init",e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			dao.clenup();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Error in root",e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	
		HttpSession hs=request.getSession();
		try(PrintWriter pw=response.getWriter())
		{
			String email=request.getParameter("email");
			String password=request.getParameter("pass");
			String name=request.getParameter("name");
			String city=request.getParameter("ct");
			
			hs.setAttribute("vendor_dao", dao);
			
		VendorPojo ven=new VendorPojo(email, password, name, city,Integer.parseInt(request.getParameter("phone")));
		
		dao.Regvendor(ven);
		pw.print("<a href='vdLst'>+next+</a>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
