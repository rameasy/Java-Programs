package com.eleven.test.feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class demonstrates the Java 11 features var keyword used inside lambda
 * function.
 * 
 * @author rameasy@gmail.com
 *
 */
public class LocalVariableTypeSyntax {
	public static void main(String args[]) {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		// var is introduced in Java 10 but can be used as variables only
		// In Java 11 var can be used in lambda parameters
		String resultString = sampleList.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(resultString);
	}
}
