package com.scp.designpattern.pizzahut.factory;

import com.scp.designpattern.pizzahut.model.NonVegPizza;
import com.scp.designpattern.pizzahut.model.Pizza;

public class NonVegPizzaFactory implements PizzaAbstractFactory{

	private boolean cheaseBust;
	private String size;
	private int price;
		
	public NonVegPizzaFactory(boolean cheaseBust, String size, int price) {
		super();
		this.cheaseBust = cheaseBust;
		this.size = size;
		this.price = price;
	}

	public Pizza getPizza() {
		return new NonVegPizza(cheaseBust, size, price);
	}
}
