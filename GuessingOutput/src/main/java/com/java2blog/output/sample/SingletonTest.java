package com.java2blog.output.sample;

public class SingletonTest {
	private volatile SingletonTest singletonTest;
	private SingletonTest() {}
	
	public SingletonTest getIntstance() {
		SingletonTest result = singletonTest;
		if (result == null) {
			synchronized(this) {
				if(result == null) {
					singletonTest = new SingletonTest();
				}
			}
		}
		return singletonTest;
	}

}
