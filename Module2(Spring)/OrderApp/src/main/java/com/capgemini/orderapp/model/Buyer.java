package com.capgemini.orderapp.model;

public class Buyer{
	private String bName;
	private String bCity;
	private String bState;
	private int bid;
	public Buyer() {
		super();
	}
	public Buyer(int bid, String bName, String bCity, String bState) {
		super();
		this.bid = bid;
		this.bName = bName;
		this.bCity = bCity;
		this.bState = bState;
	}
	public int getSid() {
		return bid;
	}
	public void setSid(int bid) {
		this.bid = bid;
	}
	public String getBName() {
		return bName;
	}
	public void setBName(String bName) {
		this.bName = bName;
	}
	public String getBCity() {
		return bCity;
	}
	public void setBCity(String bCity) {
		this.bCity = bCity;
	}
	public String getBState() {
		return bState;
	}
	public void setBState(String bState) {
		this.bState = bState;
	}
}
