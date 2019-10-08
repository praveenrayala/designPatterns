package com.pra.java.creational.singleton;

public class EagerConnectionSingleton {

	private static EagerConnectionSingleton connectionSingleton = new EagerConnectionSingleton();
	
	private EagerConnectionSingleton() {
		
	}
	
	public EagerConnectionSingleton getInstance() {
		return connectionSingleton;
	}
}
