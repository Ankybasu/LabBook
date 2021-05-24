package com.capgemini.collections;

import java.util.Date;

public class Customer {
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", custName=" + custName + ", age=" + age + ", dob=" + dob + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	private int cid;
	private  String custName;
	private int age;
	private Date dob;
	private String email;
	private String mobileNumber;
	public Customer() {
		super();
	}
	public Customer(int cid, String custName, int age, Date dob, String email, String mobileNumber) {
		super();
		this.cid = cid;
		this.custName = custName;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
