package com.eleven.test.feature;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayFeature {
	public static void main(String[] args) {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);
		System.out.println(sampleArray.length);
		for (String sample : sampleArray) {
			System.out.println(sample);
		}
	}
}
