package com.capgemini.hashset;

public class Flower {
	private int fid;
	private String fname;
	private double pricePerKg;
	private int qty;
	public Flower() {
		super();
	}
	public Flower(int fid, String fname, double pricePerKg, int qty) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.pricePerKg = pricePerKg;
		this.qty = qty;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Flower [fid=" + fid + ", fname=" + fname + ", pricePerKg=" + pricePerKg + ", qty=" + qty + "]";
	}
}
