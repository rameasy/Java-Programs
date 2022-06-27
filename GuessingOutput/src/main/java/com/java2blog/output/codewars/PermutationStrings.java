package com.java2blog.output.codewars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * The Class Permutations. In this kata you have to create all permutations of
 * an input string and remove duplicates, if present. This means, you have to
 * shuffle all letters from the input in all possible orders.
 * 
 * @author rameasy@gmail.com
 *
 * 
 */
public class PermutationStrings {

	private PermutationStrings() {

	}

	public static List<String> singlePermutations(String s) {
		Set<String> permutations = new HashSet<>();
		if (s.length() == 0) {
			permutations.add("");
			return new ArrayList<>(permutations);
		}
		char initialChar = s.charAt(0);
		String remainingString = s.substring(1);
		List<String> words = singlePermutations(remainingString);
		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				permutations.add(swapStrings(word, initialChar, i));
			}
		}
		return new ArrayList<>(permutations);
	}

	public static String swapStrings(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}
}
