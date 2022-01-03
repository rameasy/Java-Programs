package com.eleven.test.feature;

import java.util.stream.Collectors;

/**
 * This class demonstrates the Java 11 features with String functionalities.
 * 
 * @author rameasy@gmail.com
 *
 */
public class StringFeatures {
	public static void main(String[] args) {
		// New String methods isBlank, lines, trim, strip, stripLeading, stripTrailign
		System.out.println("\" \".isBlank() is " + " ".isBlank());
		System.out.println("\"\".isBlank() is " + "".isBlank());

		String str1 = "Raam\nRaam\nRaam";
		System.out.println(str1);
		// Separates by line terminator
		System.out.println(str1.lines().collect(Collectors.toList()));

		String str2 = "   Raa		";
		System.out.println("My Name is " + str2.trim() + ".");//Removes leading and trailing spaces
		System.out.println("My Name is " + str2.strip() + ".");//Removes leading and trailing spaces
		System.out.println("My Name is " + str2.stripLeading() + ".");//Removes leading spaces
		System.out.println("My Name is " + str2.stripTrailing() + ".");//Removes trailing spaces
		System.out.println("My Name is " + str2.repeat(4) + ".");//prints the times of values passed
	}
}
