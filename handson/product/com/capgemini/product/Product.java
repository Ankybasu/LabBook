package com.capgemini.product;

public class Product {
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", price=" + price + "]";
	}
	private int pid;
	private String pName;
	private double price;
	public Product(String pName, double price) {
		super();
		this.pName = pName;
		this.price = price;
	}
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int c) {
		this.pid =c;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	

}
