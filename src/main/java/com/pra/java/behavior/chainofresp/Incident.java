package com.pra.java.behavior.chainofresp;

public class Incident {

	private IncidentEnum type;
	public IncidentEnum getType() {
		return type;
	}
	public void addIncident(IncidentEnum type) {
		this.type=type;
		System.out.println(" raised a Incident for type: "+ type);
	}
	public Incident(IncidentEnum type) {
		addIncident(type);
	}
	
}
