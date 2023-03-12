package com.basic.dev.behavioral;

import com.basic.dev.behavioral.strategy.CreditCardStrategy;
import com.basic.dev.behavioral.strategy.Item;
import com.basic.dev.behavioral.strategy.PaypalStrategy;
import com.basic.dev.behavioral.strategy.ShoppingCart;

/*
 * The Strategy pattern is known as a behavioural pattern - it's used to manage algorithms, relationships and 
 * responsibilities between objects.
 */

/* When to use the Strategy design pattern in Java?
 * Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual 
 * implementation to be used at runtime.
 * 
 * In Strategy pattern we create an abstraction, which is an interface through which clients interact with our system. 
 * Behind the abstraction we create multiple implementation of same interface with different algorithms.
 * 
 * The main difference is that in State pattern internal state of an Object is one of the determining factors for selecting the
 * Strategy for change of state. Where as in Strategy pattern, client can pass some external parameter in input during method invocation that determines the
 * strategy to be used at run time. Therefore State pattern is based on the Object’s internal state, where as Strategy pattern is based on Client’s invocation.
 */
/*
 * Examples :
 * One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. 
 * Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.
 * 
 * Pros: 
 * Prevents the conditional statements. (switch, if, else…)
 * The algorithms are loosely coupled with the context entity. They can be changed/replaced without changing the context entity.
 * Very easy extendable.
 * 
 * Cons:
 * Clients must know existence of different strategies and a client must understand how the Strategies differ.
 * It increases the number of objects in the application.
 */
public class StrategyPattern {
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

		// pay by credit card
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}
