package com.java2blog.output.guessing;

public class UpcastingDowncastingExample {
	public static void main(String args[]) {
		Base obj = (Base) new SubClass(); // Upcasting. Here, super class reference o refers to sub class object.
		obj.m1();
		//SubClass subObj1 = (SubClass) new Base();
		//subObj1.m1(); // Downcasting. Here, sub class reference o refers to super class object and throws ClassCastException.
		SubClass subObj2 = (SubClass) obj;
		subObj2.m1();// Downcasting possible by converting base class reference type into sub class reference 
	}
}

class Base {
	void m1() {
		System.out.println("m1 method in class Base");
	}
}

class SubClass extends Base {
	void m1() {
		System.out.println("m1 method in class SubClass");
	}
}
