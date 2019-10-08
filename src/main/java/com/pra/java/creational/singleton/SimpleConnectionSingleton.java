package com.pra.java.creational.singleton;

public class SimpleConnectionSingleton {

	private static SimpleConnectionSingleton connectionSingleton;
	
	private SimpleConnectionSingleton() {
		
	}
	
	public SimpleConnectionSingleton getInstance() {
		if(connectionSingleton!=null)
			connectionSingleton= new SimpleConnectionSingleton();
		return connectionSingleton;
	}
}
