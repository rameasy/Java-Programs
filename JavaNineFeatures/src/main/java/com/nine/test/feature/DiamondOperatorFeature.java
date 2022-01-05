package com.nine.test.feature;

/**
 * This class demonstrates the Java 9 feature: Diamond Operator. Diamond
 * operator was introduced in java 7 to make code more readable but it could not
 * be used with Anonymous inner classes. In java 9, it can be used with
 * annonymous class as well to simplify code and improves readability.
 * 
 * @author rameasy@gmail.com
 */
public class DiamondOperatorFeature {

	public static void main(String[] args) {
		Handler<Integer> intHandler = new Handler<>(1) {
			@Override
			public void handle() {
				System.out.println(content);
			}
		};
		intHandler.handle();
		Handler<? extends Number> intHandler1 = new Handler<>(2) {
			@Override
			public void handle() {
				System.out.println(content);
			}
		};
		intHandler1.handle();
		Handler<?> handler = new Handler<Object>("test") {
			@Override
			public void handle() {
				System.out.println(content);
			}
		};
		handler.handle();
	}
}

abstract class Handler<T> {
	public T content;

	public Handler(T content) {
		this.content = content;
	}

	abstract void handle();
}