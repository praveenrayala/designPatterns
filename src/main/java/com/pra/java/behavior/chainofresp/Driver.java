package com.pra.java.behavior.chainofresp;

public class Driver {

	public static void main(String[] args) {
		SupportMatrix l1 = new L1Support();
		SupportMatrix l2 = new L2Support();
		SupportMatrix l3 = new L3Support();
		l1.setRedirect(l2);
		l2.setRedirect(l3);
		l1.raise(new Incident(IncidentEnum.INFRA_SUPPORT));
	}
}
