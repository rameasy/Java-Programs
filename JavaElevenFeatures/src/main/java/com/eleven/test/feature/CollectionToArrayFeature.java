package com.eleven.test.feature;

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates the Java 11 feature of converting list to arrays.
 * 
 * @author rameasy@gmail.com
 */
public class CollectionToArrayFeature {
	public final static void main(String[] args) {
		List<String> sampleStringList = Arrays.asList("Java", "Kotlin");
		String[] sampleStringArray = sampleStringList.toArray(String[]::new);
		System.out.println(sampleStringArray.length);
		for (String sample : sampleStringArray) {
			System.out.println(sample);
		}
		// The above is equivalent to below code but it will create an array of size 5:
		String[] array2 = sampleStringList.toArray(new String[5]);
		System.out.println(array2.length);
		for (String sample : array2) {
			System.out.println(sample);
		}
		List<Integer> sampleIntegerList = Arrays.asList(1, 2, 3, 6, 7, 9, 4);
		Integer[] sampleIntegerArray = sampleIntegerList.toArray(Integer[]::new);
		System.out.println(sampleIntegerArray.length);
		for (Integer sample : sampleIntegerArray) {
			System.out.println(sample);
		}
		
		String s1 = "ABCD";
		String s2 = "ABCD";
		System.out.println(s1.equals(s2) + " " + s1.hashCode() + " " + s2.hashCode());
	}
}
