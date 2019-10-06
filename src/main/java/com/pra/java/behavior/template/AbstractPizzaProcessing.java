package com.pra.java.behavior.template;

public abstract class AbstractPizzaProcessing implements FastFoodProcessing {

	public boolean isExtraCheese = false;

	private void makeDough() {
		System.out.println("preparing dough....");
	}

	private void addExtraCheese() {
		System.out.println("extra cheese is added..");
	}
	
	private void readyForDelivery() {
		System.out.println("Ready for eating ....");
	}

	abstract void addToppings();

	abstract void addGarnish();

	@Override
	public void prepareDish() {
		makeDough();
		addToppings();
		addGarnish();
		if (isExtraCheese) {
			addExtraCheese();
		}
		readyForDelivery();
	}

}
