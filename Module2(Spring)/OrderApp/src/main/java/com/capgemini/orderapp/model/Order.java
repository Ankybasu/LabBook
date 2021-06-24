package com.capgemini.orderapp.model;

public class Order {
	private String oName;
	private int oid;
	private double totAmount;
	public Order() {
		super();
	}
	public Order(String oName, int oid, double totAmount) {
		super();
		this.oName = oName;
		this.oid = oid;
		this.totAmount = totAmount;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getTotAmount() {
		return totAmount;
	}
	public void setTotAmount(double totAmount) {
		this.totAmount = totAmount;
	}
}
