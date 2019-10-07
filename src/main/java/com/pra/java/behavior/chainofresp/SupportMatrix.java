package com.pra.java.behavior.chainofresp;

public interface SupportMatrix {

	ActionEnum raise(Incident incident);
    void setRedirect(SupportMatrix redirect);
}
