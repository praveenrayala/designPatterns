/**
 * 
 */
package com.pra.java.behaiour.stratergy;

/**
 * @author user
 *
 */
public class PaymentContext {

	private  PaymentGateway gateway;
	PaymentContext(PaymentGateway gateway){
		this.gateway = gateway;
	}
	
	public void doPayment(double amount) {
		gateway.pay(amount);
	}
	
}
