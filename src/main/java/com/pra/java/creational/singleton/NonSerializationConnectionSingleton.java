package com.pra.java.creational.singleton;

import java.io.Serializable;

public class NonSerializationConnectionSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7912332920370538740L;
	private static NonSerializationConnectionSingleton connectionSingleton= new NonSerializationConnectionSingleton();
	
	private NonSerializationConnectionSingleton() {
		
	}
	
	public synchronized NonSerializationConnectionSingleton getInstance() {
		return connectionSingleton;
	}

    protected Object readResolve() 
    { 
        return connectionSingleton; 
    } 
}
