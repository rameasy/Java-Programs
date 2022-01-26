package com.java2blog.output.codewars;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

/**
 * The Class CountingDuplicates.
 * 
 * Write a function that will return the count of distinct case-insensitive
 * alphabetic characters and numeric digits that occur more than once in the
 * input string. The input string can be assumed to contain only alphabets (both
 * uppercase and lowercase) and numeric digits. Example ------- "abcde" -> 0 #
 * no characters repeats more than once "aabbcde" -> 2 # 'a' and 'b' "aabBcde"
 * -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`) "indivisibility" -> 1 #
 * 'i' occurs six times "Indivisibilities" -> 2 # 'i' occurs seven times and 's'
 * occurs twice "aA11" -> 2 # 'a' and '1' "ABBA" -> 2 # 'A' and 'B' each occur
 * twice
 * 
 */
public class CountingDuplicates {
	public static void main(String args[]) {
		System.out.println(duplicateCount("Indivisibilities"));
	}

	public static int duplicateCount(String text) {
		char []charArray = text.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<charArray.length; i++) {
			char currentChar = charArray[i];
			if(map.get(currentChar) == null) {
				map.put(currentChar, 1);
			} else {
				Integer value = map.get(currentChar);
				map.put(currentChar, ++value);
			}
		}
		return (int) map.entrySet().stream().filter(entry -> entry.getValue().intValue() > 1).count();
	}
}
