package com.pra.java.behavior.template;

public class Driver {

	public static void main(String[] args) {
		FastFoodProcessing fastFoodProcessing = new ChickenCornPizza(true);
		fastFoodProcessing.prepareDish();
	}
}
