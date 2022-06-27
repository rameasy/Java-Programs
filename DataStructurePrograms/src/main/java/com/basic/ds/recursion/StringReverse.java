package com.basic.ds.recursion;

public class StringReverse {
	public static String reverse(String string) {
		if (string.isEmpty()) {
			return string;
		}
		return reverse(string.substring(1)) + string.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println("Reverse value of abc is " + reverse("abc"));
		System.out.println("Reverse value of reverse is " + reverse("reverse"));
		System.out.println("Reverse value of madam is " + reverse("madam"));

	}
}
