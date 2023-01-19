package com.iit.edu.SpringBootReg.register;

public class Register {

	
	private String Name;
	private String EmailId;
	private int mobileNo;
	private String address;
	private String password;
	private String conPass;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConPass() {
		return conPass;
	}
	public void setConPass(String conPass) {
		this.conPass = conPass;
	}
	@Override
	public String toString() {
		return "Register [Name=" + Name + ", EmailId=" + EmailId + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", password=" + password + ", conPass=" + conPass + "]";
	}
	
	
	
}
