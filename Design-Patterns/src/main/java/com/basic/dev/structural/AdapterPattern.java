package com.basic.dev.structural;

import com.basic.dev.structural.adapter.BugattiVeyron;
import com.basic.dev.structural.adapter.Movable;
import com.basic.dev.structural.adapter.MovableAdapter;
import com.basic.dev.structural.adapter.MovableAdapterImpl;

/*
 * An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. 
 * An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.
 * The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. It's usually implemented once the application is designed.
 * 
 */

/* When to use the Adapter design pattern in Java?
 * The adapter pattern is often used to make existing classes work with others without modifying their source code. 
 */
/*
 * Examples:
 * java.util.Arrays#asList() - This method acts as bridge between array-based and collection-based APIs, in combination with Collection.toArray(). 
 * java.util.Collections#list() = This method provides interoperability between legacy APIs that return enumerations and new APIs that require collections.
 * 
 */

/*
 * Problem : Consider a scenario in which there is an app that's developed in the US which returns the top speed of luxury 
 * cars in miles per hour (MPH). Now we need to use the same app for our client in the UK that wants the same results but 
 * in kilometers per hour (km/h). 
 *
 */
public class AdapterPattern {
	public static void main(String args[]) {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println("Speed of bugattiVeyron is :: " + bugattiVeyron.getSpeed() + " MPH");
		System.out.println("Speed of bugattiVeyron is :: " + bugattiVeyronAdapter.getSpeed() + " KMPH");
	}
}
