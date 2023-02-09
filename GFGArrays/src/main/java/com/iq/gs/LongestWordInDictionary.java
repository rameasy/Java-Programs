package com.iq.gs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LongestWordInDictionary {
	public static String findLongestWord(String s, List<String> dictionary) {
		Collections.sort(dictionary, Comparator.comparingInt(String::length));
		char[] charArray = s.toCharArray();
		boolean wordFound = false;
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int i = dictionary.size() - 1; i > 0; i--) {
			wordFound = true;
			char[] word = dictionary.get(i).toCharArray();
			Map<Character, Integer> tempMap = new HashMap<>();
			for (char c : word) {
				if (tempMap.containsKey(c)) {
					tempMap.put(c, tempMap.get(c) + 1);
				} else {
					tempMap.put(c, 1);
				}
			}

			for (Entry entry : tempMap.entrySet()) {
				if (wordFound && map.containsKey(entry.getKey())
						&& map.get(entry.getKey()) >= tempMap.get(entry.getKey())) {
					continue;
				} else {
					wordFound = false;
				}
			}
			if (wordFound) {
				return dictionary.get(i);
			}
		}
		return null;
	}

	public static void main(String args[]) {
		String s = "abpcplesa";
		List<String> dictionary = Arrays.asList("apples", "ale", "apple", "monkey", "plea");
		if ("apples".equals(findLongestWord(s, dictionary))) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}
}
