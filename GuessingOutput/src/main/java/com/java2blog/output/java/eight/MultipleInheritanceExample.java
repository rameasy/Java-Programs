package com.java2blog.output.java.eight;

interface Clickable {
	default void click() {
		System.out.println("click");
	}

	default void print() {
		System.out.println("Clickable");
	}
}

interface Accessible {
	default void access() {
		System.out.println("access");
	}

	default void print() {
		System.out.println("Accessible");
	}
}

class Button implements Clickable, Accessible {

	public void print() {
		System.out.println("Printing this as well");
		Clickable.super.print();
		Accessible.super.print();
	}

}

public class MultipleInheritanceExample {
	public static void main(String args[]) {
		Button button = new Button();
		button.click();
		button.access();
		button.print();
	}
}