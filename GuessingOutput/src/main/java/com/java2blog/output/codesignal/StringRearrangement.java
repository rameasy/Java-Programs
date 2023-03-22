package com.java2blog.output.codesignal;

import java.util.LinkedList;

/***
 * Given an array of equal-length strings, you'd like to know if it's possible
 * to rearrange the order of the elements in such a way that each consecutive
 * pair of strings differ by exactly one character. Return true if it's
 * possible, and false if not.
 * 
 * Note: You're only rearranging the order of the strings, not the order of the
 * letters within the strings!
 * 
 * Example
 * 
 * For inputArray = ["aba", "bbb", "bab"], the output should be
 * solution(inputArray) = false.
 * 
 * There are 6 possible arrangements for these strings:
 * 
 * ["aba", "bbb", "bab"] ["aba", "bab", "bbb"] ["bbb", "aba", "bab"] ["bbb",
 * "bab", "aba"] ["bab", "bbb", "aba"] ["bab", "aba", "bbb"] None of these
 * satisfy the condition of consecutive strings differing by 1 character, so the
 * answer is false.
 * 
 * For inputArray = ["ab", "bb", "aa"], the output should be
 * solution(inputArray) = true.
 * 
 * It's possible to arrange these strings in a way that each consecutive pair of
 * strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so
 * return true.
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] array.string inputArray
 * 
 * A non-empty array of strings of lowercase letters.
 * 
 * Guaranteed constraints: 2 ≤ inputArray.length ≤ 10, 1 ≤ inputArray[i].length
 * ≤ 15.
 * 
 * [output] boolean
 * 
 * Return true if the strings can be reordered in such a way that each
 * neighbouring pair of strings differ by exactly one character (false
 * otherwise).
 */
public class StringRearrangement {
	boolean solution(String[] inputArray) {
		LinkedList<String> list1 = new LinkedList<>();
		for (int i = 0; i < inputArray.length; i++) {
			list1.add(inputArray[i]);
		}
		LinkedList<String> list2 = new LinkedList<>();
		list2.offer(list1.poll());
		int strLen = list1.get(0).length();
		while (!list1.isEmpty()) {
			int size = list1.size();
			String first = list2.getFirst();
			String last = list2.getLast();
			for (int i = 0; i < size; i++) {
				String actual = list1.poll();
				if (findDifference(first, actual, strLen)) {
					list2.addFirst(actual);
					break;
				} else if (findDifference(last, actual, strLen)) {
					list2.addLast(actual);
					break;
				} else {
					list1.offer(actual);
				}
			}
			if (size == list1.size()) {
				return false;
			}
		}

		return true;
	}

	boolean findDifference(String target, String actual, int len) {
		int diff = 0;
		for (int i = 0; i < len; i++) {
			if (target.charAt(i) != actual.charAt(i)) {
				diff++;
			}
		}
		return diff == 1;
	}
}
