package com.basic.dev.creational;

import com.basic.dev.creational.abstractfactory.AbstractCurrencyFactory;
import com.basic.dev.creational.abstractfactory.CryptoCurrencyFactory;
import com.basic.dev.creational.abstractfactory.FiatCurrencyFactory;

/*
 * Abstract factory pattern is yet another creational design pattern and is considered as another layer of abstraction over factory pattern..
 * 
 */

/* When to use the Factory design pattern in Java?
 * The client is independent of how we create and compose the objects in the system.
 * The system consists of multiple families of objects, and these families are designed to be used together.
 * We need a run-time value to construct a particular dependency.
 */
/*
 * Examples
 * DocumentBuilderFactory.newInstance()
 * TransformerFactory.newInstance()
 */
public class AbstractFactoryPattern {
	public static void main(String args[]) {
		AbstractCurrencyFactory acf = new AbstractCurrencyFactory();
		System.out.println("US currency symbol is " + ((FiatCurrencyFactory) acf.create("fiat").getCurrency()).getCurrency("US").getSymbol());
		System.out.println("Bitcoin symbol is " + ((CryptoCurrencyFactory) acf.create("crypto").getCurrency()).getCurrency("Bitcoin").getSymbol());

	}
}
