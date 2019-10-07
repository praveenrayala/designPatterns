package com.pra.java.behavior.chainofresp;

public class L3Support extends AbstractSupport {

	@Override
	public ActionEnum raise(Incident incident) {
		if(incident.getType().equals(IncidentEnum.EXERNAL_SUPPORT)) {
			System.out.println("Acccepted by L3 support");
			return ActionEnum.ACCEPT;
		}
		
		else {
			System.out.println("Rejected by L3 support");
		    return ActionEnum.REJECT;
		}
	}

}
