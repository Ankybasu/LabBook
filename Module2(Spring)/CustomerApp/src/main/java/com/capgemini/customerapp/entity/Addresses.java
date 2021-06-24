package com.capgemini.customerapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Addresses {
	@Id
	@SequenceGenerator(name="addSeqGen",sequenceName="instrSeq",initialValue=301,allocationSize=100)
	@GeneratedValue(generator="addSeqGen")
	private Integer addressId;
	
	private String address;
	

	public Addresses(String address) {
		super();
		this.address = address;
	}
	@Override
	public String toString() {
		return "Addresses [addressId=" + addressId + ", address=" + address + "]";
	}
	public Addresses() {
		super();
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
