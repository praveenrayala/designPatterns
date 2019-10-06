package com.pra.java.behavior.template;

public class PaneerMushroomPizza extends AbstractPizzaProcessing {

	public PaneerMushroomPizza(boolean extraCheese) {
		this.isExtraCheese = extraCheese;
	}

	@Override
	void addToppings() {
		System.out.println("Adding Paneer ....");

	}

	@Override
	void addGarnish() {
		System.out.println("Adding Mushroom ....");
	}

}
