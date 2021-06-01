package com.capgemini.contactmanagerapp.model;

/**
 *@author AnkyBasu
 */
public class Contact {
	private String fName;
	private String lName;
	private String phoneNo;
	public Contact() {
		super();
	}
	/**
	 *@param fName to store the firstName 
	 *@param lName to store the lastName
	 *@param phoneNo to store the phone number
	 */
	public Contact(String fName, String lName, String phoneNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo + "]";
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}
	/*
	 * validate First Name
	 */
	public void validateFirstName() {
		// TODO Auto-generated method stub
		if(this.fName.isBlank()) {
			throw new RuntimeException("FirstName cannot be null");
		}
		
	}
	/*
	 * validate Last Name
	 */
	public void validateLastName() {
		// TODO Auto-generated method stub
		if(this.lName.isBlank()) {
			throw new RuntimeException("LastName cannot be null");
		}
		
	}
	/*
	 * validate Phone number
	 */
	public void validatePhoneNo() {
		// TODO Auto-generated method stub
		if(this.phoneNo.isBlank()) {
			throw new RuntimeException("Phone number cannot be null");
		}
		if(this.phoneNo.length()!=11) {
			throw new RuntimeException("Phone number should be 11 digits");
		}
		if(!this.phoneNo.matches("\\d+")) {
			throw new RuntimeException("Phone number can contain only digits!");
		}
		if(!this.phoneNo.startsWith("0")) {
			throw new RuntimeException("Phone number should start with zero!");
		}
	}

}
