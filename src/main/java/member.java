
public class member {
private String fname,Id,email,mobile,address;

public member() {
	super();
}

public member(String fname, String id, String email, String mobile, String address) {
	super();
	this.fname = fname;
	this.Id = id;
	this.email = email;
	this.mobile = mobile;
	this.address = address;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getId() {
	return Id;
}

public void setId(String id) {
	this.Id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
} 

}
