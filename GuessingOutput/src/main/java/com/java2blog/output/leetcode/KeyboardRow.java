package com.java2blog.output.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
	public static void main(String[] args) {
		KeyboardRow kr = new KeyboardRow();
		String[] args1 = new String[] { "Hello", "Alaska", "Dad", "Peace" };
		String []result = kr.findWords(args1);
		for(String res : result) {
			System.out.println(res);
		}
	}

	public String[] findWords(String[] words) {
		String firstRow = "qwertyuiop";
		String secondRow = "asdfghjkl";
		String thirdRow = "zxcvbnm";
		if (words == null || words.length == 0) {
			return new String[] {};
		}
		List<String> result = new ArrayList<>();
		for (String word : words) {
			if (validateWord(firstRow, word.toLowerCase()) || validateWord(secondRow, word.toLowerCase()) || validateWord(thirdRow, word.toLowerCase())) {
				result.add(word);
			}
		}
		return result.toArray(String[]::new);
	}

	public boolean validateWord(String row, String word) {
		char []charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!row.contains(String.valueOf(charArray[i]))) {
				return false;
			}
		}
		return true;
	}
}
