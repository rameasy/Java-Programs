package com.java2blog.output.guessing;

public class Guess1 {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		//a.m2(); // m2 not available in A
	}
}

class A {
	void m1() {
		System.out.println("In m1 A");
	}
}

class B extends A {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

class C extends B {
	void m1() {
		System.out.println("In m1 C");
	}

	void m2() {
		System.out.println("In m2 C");
	}
}