package com.scp.designpattern.pizzahut.factory;

import com.scp.designpattern.pizzahut.model.Pizza;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza pizza1 = PizzaFactory.getPizza(new VegPizzaFactory(true, "Small", 350));
		Pizza pizza2 = PizzaFactory.getPizza(new NonVegPizzaFactory(false, "Large", 550));
		
		System.out.println(pizza1);
		System.out.println(pizza2);
	}
}
