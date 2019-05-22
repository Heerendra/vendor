package beans;

import java.util.List;

import dao.VendorDaoImpl;
import pojos.VendorPojo;

public class vendorBeans {
	private VendorDaoImpl dao;
  public vendorBeans() throws Exception {
	// TODO Auto-generated constructor stub
	  dao=new VendorDaoImpl();
}
	public List<VendorPojo>getAllVendors() throws Exception
	{
		return dao.getAllVendors();
	}
}
