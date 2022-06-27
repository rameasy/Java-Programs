package com.basic.ds.recursion;

public class Factorial {
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 2 is " + factorial(2));
		System.out.println("Factorial of 5 is " + factorial(5));
		System.out.println("Factorial of 10 is " + factorial(10));
	}
}
