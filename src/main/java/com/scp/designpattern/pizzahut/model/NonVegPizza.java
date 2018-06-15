package com.scp.designpattern.pizzahut.model;

public class NonVegPizza extends Pizza{

	private boolean cheaseBust;
	private String size;
	private int price;
	
		
	public NonVegPizza(boolean cheaseBust, String size, int price) {
		super();
		this.cheaseBust = cheaseBust;
		this.size = size;
		this.price = price;
	}

	@Override
	public String getType() {
		return "NON-VEG";
	}

	@Override
	public boolean cheesBust() {
		return cheaseBust;
	}

	@Override
	public String getSize() {
		return size;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
