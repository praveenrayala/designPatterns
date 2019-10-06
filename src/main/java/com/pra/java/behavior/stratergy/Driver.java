package com.pra.java.behavior.stratergy;

public class Driver {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext(new PaytmPaymentGateway());
		context.doPayment(20);
	}
}
