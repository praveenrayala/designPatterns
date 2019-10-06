package com.pra.java.behavior.template;

public class ChickenCornPizza extends AbstractPizzaProcessing{

	public ChickenCornPizza(boolean extraCheese) {
	   this.isExtraCheese = extraCheese;
	}
	@Override
	void addToppings() {
		System.out.println("Adding Chicken ....");
		
	}

	@Override
	void addGarnish() {
		System.out.println("Adding Corn ....");
	}

}
