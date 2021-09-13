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
 */
/*
 * Examples :
 * One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. 
 * Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.
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
