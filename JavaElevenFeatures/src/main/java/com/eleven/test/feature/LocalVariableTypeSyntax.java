package com.eleven.test.feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableTypeSyntax {
	public static void main(String args[]) {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String resultString = sampleList.stream().map((var x) -> x.toUpperCase())
				.collect(Collectors.joining(", "));
	}
}
