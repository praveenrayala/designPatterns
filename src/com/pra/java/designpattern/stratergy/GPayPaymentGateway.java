/**
 * 
 */
package com.pra.java.designpattern.stratergy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author user
 *
 */
public class GPayPaymentGateway implements PaymentGateway {

	@Override
	public long pay(double amount) {
		System.out.println("Payment of rs :"+ amount +" done by using Gpay");
		return ThreadLocalRandom.current().nextLong(100);
	}

}
