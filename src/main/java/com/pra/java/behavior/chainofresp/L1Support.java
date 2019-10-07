package com.pra.java.behavior.chainofresp;

public class L1Support extends AbstractSupport {

	@Override
	public ActionEnum raise(Incident incident) {
		if(incident.getType().equals(IncidentEnum.APP_SUPPORT)) {
			System.out.println("Acccepted by L1 support");
			return ActionEnum.ACCEPT;
		}
		
		else {
			System.out.println("redirected by L1 support to next level");
			return getRedirect().raise(incident);
		}
	}

}
