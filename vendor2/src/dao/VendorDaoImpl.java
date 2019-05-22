package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static DBUtil.DB_Connect.*;
import pojos.VendorPojo;



public class VendorDaoImpl implements IvendorDao{
	private Connection cn;
	private PreparedStatement pst1,pst2;
	public VendorDaoImpl() throws Exception  {
		super();
		cn=getConn();		
		pst1=cn.prepareStatement("insert into vendor values(default,?,?,?,?,?)");
		pst2=cn.prepareStatement("select * from vendor");
		
	}
	@Override
	public void Regvendor(VendorPojo c) throws Exception {
		
		pst1.setString(1,c.getEmail());
		pst1.setString(2,c.getPassword());
		pst1.setString(3,c.getName());
		
		pst1.setString(4,c.getCity());
		pst1.setInt(5,c.getPhoneno());
		
		pst1.executeUpdate();
		System.out.println("inserted");
		
	}
	@Override
	public List<VendorPojo> getAllVendors() throws Exception {
		
			ArrayList<VendorPojo> list= new ArrayList<>();
			try(ResultSet rs=pst2.executeQuery()){
				while(rs.next())
				{
						list.add(new VendorPojo(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
				}
			}

		
		return list;
	}
	
	public void clenup() throws SQLException
	{
		if(cn!=null)
		{
			cn.close();
		}
		if(pst1!=null)
		{
			pst1.close();
		}
		
		if(pst2!=null) 
		 { 
		 pst2.close();
		  }
		 
	}
	
	

}
