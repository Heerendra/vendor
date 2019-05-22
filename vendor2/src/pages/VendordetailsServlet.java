package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VendorDaoImpl;
import pojos.VendorPojo;

/**
 * Servlet implementation class VendordetailsServlet
 */
@WebServlet("/vdLst")
public class VendordetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		//HttpServlet hs=(HttpServlet) request.getSession();
		HttpSession hs=request.getSession();
		try(PrintWriter pw=response.getWriter())
		{
			
				
			 VendorDaoImpl dao=(VendorDaoImpl) hs.getAttribute("vendor_dao");
			 List<VendorPojo>Lst = dao.getAllVendors();
			 pw.print("<table border=2 >");
	pw.print("<tr><th>Id</th><th>Email</th><th>Name</th><th>City</th><th>Phone_Number</th></tr>");
			 for(VendorPojo p: Lst)
			 {
				
				 pw.print("<tr> <td>"+p.getId()+"</td><td>"+p.getEmail()+"</td><td>"+p.getName()+"</td><td>"+p.getCity()+"</td><td>"+p.getPhoneno()+"</td><td><a href='update.html'>update</a></td></tr>");
				
				 
			 }
			 pw.print("</table>");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}

}
