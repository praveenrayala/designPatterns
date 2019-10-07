package com.pra.java.behavior.chainofresp;

public abstract class AbstractSupport implements SupportMatrix{

	private SupportMatrix redirect; 
	public SupportMatrix getRedirect() {
		return redirect;
	}
	public void setRedirect(SupportMatrix redirect) {
		this.redirect = redirect;
	}
	public abstract ActionEnum raise(Incident incident); 

}
