package com.pra.java.behavior.chainofresp;

public class L2Support extends AbstractSupport {

	@Override
	public ActionEnum raise(Incident incident) {
		
		if(incident.getType().equals(IncidentEnum.INFRA_SUPPORT)
				|| incident.getType().equals(IncidentEnum.MIDDLEWARE_SUPPORT)) {
			System.out.println("Acccepted by L2 support");
			return ActionEnum.ACCEPT;
		}
		
		else {
			System.out.println("redirected by L2 support to next level");
			return getRedirect().raise(incident);
		}
	}

}
