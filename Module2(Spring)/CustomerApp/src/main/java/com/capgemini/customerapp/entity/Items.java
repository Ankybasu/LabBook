package com.capgemini.customerapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class Items {
	
	@Id
	@SequenceGenerator(name = "ItemsSeqGen",sequenceName = "ItemsSeq",initialValue = 201,allocationSize = 100)
	@GeneratedValue(generator = "ItemsSeqGen")
	@Column(name="itemId")
	private Integer itemId;
	
	private String itemName;
	
	private String itemDescription;
	
	@ManyToMany(mappedBy = "items" ,cascade = {CascadeType.ALL})
	private Set<Orders> order = new HashSet<>();

	public Set<Orders> getOrder() {
		return order;
	}

	public void setOrder(Set<Orders> order) {
		this.order = order;
	}

	public Items(String itemName, String itemDescription) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", order=" + order + "]";
	}





}
