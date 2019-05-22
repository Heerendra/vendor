package dao;
import java.util.*;

import pojos.VendorPojo;
public interface IvendorDao {
	
	void Regvendor(VendorPojo c)throws Exception;
	List<VendorPojo>getAllVendors()throws Exception;
	
}
