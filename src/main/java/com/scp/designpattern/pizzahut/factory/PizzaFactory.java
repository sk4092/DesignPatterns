package com.scp.designpattern.pizzahut.factory;

import com.scp.designpattern.pizzahut.model.Pizza;

public class PizzaFactory {
	public static Pizza getPizza(PizzaAbstractFactory factory) {
		return factory.getPizza();
	}
}
