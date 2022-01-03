package com.eleven.test.feature;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/**
 * This class demonstrates the Java 11 features Predicate not function.
 * 
 * @author rameasy@gmail.com
 *
 */
public class PredicateNotFeature {

	public static void main(String[] args) {
		var sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		var withoutBlanks = sampleList.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		System.out.println(withoutBlanks);

	}

}
