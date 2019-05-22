package pojos;

public class VendorPojo {
	int id,phoneno;
	String email,password,name,city;
	
	
	





	public VendorPojo(String email, String password, String name, String city , int phoneno) {
		super();
		
		this.email = email;
		this.password = password;
		this.name = name;
		this.city = city;
		this.phoneno=phoneno;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPhoneno() {
		return phoneno;
	}


	public VendorPojo(int id, 
			String email, String password, String name, String city, int phoneno) {
		super();
		this.id = id;
		this.phoneno = phoneno;
		this.email = email;
		this.password = password;
		this.name = name;
		this.city = city;
	}





	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "VendorPojo [vendorid=" + id + ", phoneno=" + phoneno + ", email=" + email + ", password=" + password
				+ ", name=" + name + ", city=" + city + "]";
	}
	
	

}
