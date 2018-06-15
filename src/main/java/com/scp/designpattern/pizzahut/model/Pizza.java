package com.scp.designpattern.pizzahut.model;

public abstract class Pizza {

	public abstract String getType();
	public abstract boolean cheesBust();
	public abstract String getSize();
	public abstract int getPrice();
	
	@Override
	public String toString() {
		return "Pizza [getType()=" + getType() + ", cheesBust()=" + cheesBust() + ", getSize()=" + getSize()
				+ ", getPrice()=" + getPrice() + "]";
	}	
	
}
