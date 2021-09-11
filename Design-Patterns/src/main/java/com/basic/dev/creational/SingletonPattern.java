package com.basic.dev.creational;

/*
 * Singleton pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
 * 
 */

/* When to use the Builder design pattern in Java?
 * Singleton pattern is used when a class in your program should have just a single instance available to all clients;
 */
/*
 * Examples : java.lang.Runtime#getRuntime()
 * java.awt.Desktop#getDesktop()
 * java.lang.System#getSecurityManager()
 */

/*
 * Make constructor as private. 
 * Make a private static instance (class-member) of this singleton class. 
 * But, DO NOT instantiate it. Write a static/factory method that checks the static instance member for null and creates the instance. 
 */
class SingletonPattern {
	private static SingletonPattern SINGLE_INSTANCE = null;

	private SingletonPattern() {
	}

	public static SingletonPattern getInstance() {
		if (SINGLE_INSTANCE == null) {
			/*
			 * Suppose that there are two threads running. Both can get inside of the if
			 * statement concurrently when the instance is null. Then, one thread enters the
			 * synchronized block to initialize the instance, while the other is blocked.
			 * When the first thread exits in the synchronized block, the waiting thread
			 * enters and creates another singleton object. Note that when the second thread
			 * enters the synchronized block, it does not check to see if the instance is
			 * non-null.
			 */
			synchronized (SingletonPattern.class) {
				if (SINGLE_INSTANCE == null) {
					SINGLE_INSTANCE = new SingletonPattern();
				}
			}
		}
		return SINGLE_INSTANCE;
	}
}