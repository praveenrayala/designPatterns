/**
 * 
 */
package com.pra.java.designpattern.stratergy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author praveen rayala
 *
 */
public class PaytmPaymentGateway implements PaymentGateway {

	@Override
	public long pay(double amount) {
		System.out.println("Payment of rs :"+ amount +" done by using paytm");
		return ThreadLocalRandom.current().nextLong(100);
	}

}
