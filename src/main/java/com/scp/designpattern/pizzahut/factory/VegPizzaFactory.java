package com.scp.designpattern.pizzahut.factory;

import com.scp.designpattern.pizzahut.model.Pizza;
import com.scp.designpattern.pizzahut.model.VegPizza;

public class VegPizzaFactory implements PizzaAbstractFactory{

	private boolean cheaseBust;
	private String size;
	private int price;
		
	public VegPizzaFactory(boolean cheaseBust, String size, int price) {
		super();
		this.cheaseBust = cheaseBust;
		this.size = size;
		this.price = price;
	}

	public Pizza getPizza() {
		return new VegPizza(cheaseBust, size, price);
	}
}
