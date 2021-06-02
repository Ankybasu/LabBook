package com.capgemini.vegetable.model;

public class Vegetable implements Comparable<Vegetable>{
	private int vegid;
	private String vegName;
	private double vegPrice;
	public Vegetable() {
		super();
	}
	public Vegetable(int vegid, String vegName, double vegPrice) {
		super();
		this.vegid = vegid;
		this.vegName = vegName;
		this.vegPrice = vegPrice;
	}
	public int getVegid() {
		return vegid;
	}
	public void setVegid(int vegid) {
		this.vegid = vegid;
	}
	public String getVegName() {
		return vegName;
	}
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	public double getVegPrice() {
		return vegPrice;
	}
	public void setVegPrice(double vegPrice) {
		this.vegPrice = vegPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vegName == null) ? 0 : vegName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(vegPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + vegid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		if (vegName == null) {
			if (other.vegName != null)
				return false;
		} else if (!vegName.equals(other.vegName))
			return false;
		if (Double.doubleToLongBits(vegPrice) != Double.doubleToLongBits(other.vegPrice))
			return false;
		if (vegid != other.vegid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vegetable [vegid=" + vegid + ", vegName=" + vegName + ", vegPrice=" + vegPrice + "]";
	}
	@Override
	public int compareTo(Vegetable o) {
		// TODO Auto-generated method stub
		return (int)(vegPrice-o.vegPrice);
	}
}
