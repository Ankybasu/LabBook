package com.capgemini.orderapp.model;

public class Wallet {
	private String walletType;
	private int wid;
	private double balance;
	public Wallet() {
		super();
	}
	public Wallet(String walletType, int wid, double balance) {
		super();
		this.walletType = walletType;
		this.wid = wid;
		this.balance = balance;
	}
	public String getWalletType() {
		return walletType;
	}
	public void setWalletType(String walletType) {
		this.walletType = walletType;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
