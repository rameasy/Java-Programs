package com.java2blog.output.guessing;

public abstract class AbstractConstructorTest {

	public AbstractConstructorTest() {
		System.out.println("here a i am");
	}

	public abstract void abstractMethod();
	
	public static void main(String args[]) {
		//new AbstractConstructorTest(); // Error
		AbstractConstructorTest acct = new AbstractConstructorTest() {
		
		@Override
		public void abstractMethod() {
			Double a = 0.0;
			Double b = 1.0;
			System.out.println((b/a));
			System.out.println("Its a complete object now");
			
		}
	};
	acct.abstractMethod();
	}
	
}
