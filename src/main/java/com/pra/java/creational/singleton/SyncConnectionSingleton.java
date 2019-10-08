package com.pra.java.creational.singleton;

public class SyncConnectionSingleton {

	private static SyncConnectionSingleton connectionSingleton ;
	
	private SyncConnectionSingleton() {
		
	}
	
	public synchronized SyncConnectionSingleton getInstance() {
		if(connectionSingleton!=null)
			connectionSingleton= new SyncConnectionSingleton();
		return connectionSingleton;
	}
}
