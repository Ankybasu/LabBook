package com.capgemini.customerapp.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Customers {
	
	@Id

	@SequenceGenerator(name="custSeqGen",sequenceName="custSeq",initialValue=101,allocationSize=100)
	@GeneratedValue(generator="custSeqGen")
	private Integer custId;
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="customeraddid")
	private Integer addressId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "custid")
	private List<Orders> orders = new ArrayList<Orders>();





	public List<Orders> getOrders() {
		return orders;
	}





	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}





	public Customers(String customerName) {
		super();
		this.customerName = customerName;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id_address")
	private Addresses address;
	
	



	public Customers() {
		super();
	}





	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", addressId=" + addressId
				+ ", address=" + address + "]";
	}


	private String customerName;
	
	
	public Integer getCustId() {
		return custId;
	}


	public void setCustId(Integer custId) {
		this.custId = custId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public Addresses getAddress() {
		return address;
	}


	public void setAddress(Addresses address) {
		this.address = address;
	}



}
