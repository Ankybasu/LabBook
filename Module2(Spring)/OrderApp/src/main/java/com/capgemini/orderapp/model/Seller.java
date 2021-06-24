package com.capgemini.orderapp.model;

public class Seller {
	private int sid;
	private String sName;
	private String sCity;
	private String sState;
	public Seller() {
		super();
	}
	public Seller(int sid, String sName, String sCity, String sState) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sCity = sCity;
		this.sState = sState;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsState() {
		return sState;
	}
	public void setsState(String sState) {
		this.sState = sState;
	}
}
