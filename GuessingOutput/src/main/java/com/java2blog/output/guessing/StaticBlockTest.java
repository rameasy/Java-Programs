package com.java2blog.output.guessing;

public class StaticBlockTest {
	static {
		System.out.print("I have been called before the main method. ");
	}
	public static int StaticVariable = 23;
	static void invokeMe() {
		System.out.println("Am I invoked");
	}
	public static void main(String args[]) {
	System.out.println("Yes. Its true. ");	
	StaticBlockTest sbt = null;
	sbt.invokeMe();// null objects can invoke the static methods
	System.out.println(sbt.StaticVariable);// null objects can invoke the static variables
	}
}
