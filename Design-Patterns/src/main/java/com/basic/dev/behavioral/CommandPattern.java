package com.basic.dev.behavioral;

import com.basic.dev.behavioral.command.Chef;
import com.basic.dev.behavioral.command.Order;
import com.basic.dev.behavioral.command.Waiter;

/*
 * Command pattern intends to encapsulate in an object all the data required for performing a given action (command), 
 * including what method to call, the method's arguments, and the object to which the method belongs.
 */

/* When to use the command design pattern in Java?
 * You need a command to have a life span independent of the original request, or if you want to queue, specify and execute requests at different times.
 * You need undo/redo operations. The command’s execution can be stored for reversing its effects. It is important that the Command class implements the methods undo and redo.
 * You need to structure a system around high-level operations built on primitive operations.
 */
/*
 * Examples : java.lang.Runnable, javax.swing.Action
 * 
 */
public class CommandPattern {
	public static void main(String args[]) {
		Chef chef = new Chef();
	    Order order = new Order(chef, "Pasta");
	    Waiter waiter = new Waiter(order);
	    waiter.execute();    
	    order = new Order(chef, "Cake");
	    waiter = new Waiter(order);
	    waiter.execute();
	}
}
