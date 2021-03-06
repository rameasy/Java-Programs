package com.nine.test.feature;

import com.nine.test.feature.intrfc.PrivateInterface;

/**
 * This class demonstrates the Java 9 feature: Private interface. Kind of test
 * class for PrivateInterface.java.
 * 
 * @author rameasy@gmail.com
 */
public class PrivateImpl implements PrivateInterface {
	public static void main(String args[]) {
		PrivateImpl privateImpl = new PrivateImpl();
		privateImpl.abstractMethod();
		privateImpl.defaultMethod();
		PrivateInterface.staticMethod();
		System.out.println("The value of MY_INTEGER is " + MY_INTEGER);
	}

	@Override
	public void abstractMethod() {
		System.out.println("Inside abstract method");
	}
}
