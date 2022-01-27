package com.java2blog.output.guessing;

public class StaticBlockTest {
	static {
		System.out.print("I have been called before the main method. ");
	}
	public static void main(String args[]) {
	System.out.println("Yes. Its true. ");	
	}
}
