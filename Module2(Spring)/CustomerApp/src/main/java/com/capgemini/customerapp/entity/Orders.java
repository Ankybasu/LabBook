package com.capgemini.customerapp.entity;

import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.SequenceGenerator;

@Entity
public class Orders {

	@Id
	@SequenceGenerator(name="ordSeqGen",sequenceName="ordSeq",initialValue=555,allocationSize=100)
	@GeneratedValue(generator="ordSeqGen")
	@Column(name="orderId")
	private Integer orderId;

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer customerId;
	
	private String orderDate;
	
	private Double Amount;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="items_orders",
					joinColumns = {
							@JoinColumn(name ="orderId")
					},
						inverseJoinColumns = {
								@JoinColumn(name = "itemId")
						}
			)
	private Set<Items> items = new HashSet<Items>();
	
	
	public Set<Items> getItems() {
		return items;
	}





	public void setItems(Set<Items> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate + ", Amount="
				+ Amount + "]";
	}
	public Orders() {
		super();
	}

	public Orders(String orderDate, Double amount) {
		super();
		this.orderDate = orderDate;
		Amount = amount;
	}
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	
	
}
