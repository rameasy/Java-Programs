package com.eleven.test.feature;

import java.util.stream.Collectors;

public class StringFeatures {
	public static void main(String[] args) {
		System.out.println("\" \".isBlank() is " + " ".isBlank());
		System.out.println("\"\".isBlank() is " + "".isBlank());
		
		
		String str1 = "Raam\nRaam\nRaam";
		System.out.println(str1);
		System.out.println(str1.lines().collect(Collectors.toList()));
		
		String str2 = "   Raa		";
		System.out.println("My Name is " + str2.trim() + ".");
		System.out.println("My Name is " + str2.strip() + ".");
		System.out.println("My Name is " + str2.stripLeading() + ".");
		System.out.println("My Name is " + str2.stripTrailing() + ".");
	}
}
