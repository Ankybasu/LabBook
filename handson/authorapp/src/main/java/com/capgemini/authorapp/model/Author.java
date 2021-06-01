package com.capgemini.authorapp.model;


public class Author {
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void validateEmail() {
		// TODO Auto-generated method stub
		if(!(email.matches("^[a-zA-Z0-9._+]{3,}[a-zA-Z0-9]{0,}@[a-z]{2,}\\.(.+)$"))) {
			throw new RuntimeException("Invalid email!");
		}
		
	}
	public void validateGender() {
		// TODO Auto-generated method stub
		if(!(gender=='m'||gender=='f'||gender=='u')) {
			throw new RuntimeException("Invalid gender!");
		}
	}
	public void validateName() {
		// TODO Auto-generated method stub
		if(!(name.matches("^[a-zA-Z\\s]*$"))) {
			throw new RuntimeException("Only characters allowed! ");
		}
	}
	public void print() {
		System.out.println(name+"("+gender+") at "+email);
	}
	
}
