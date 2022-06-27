package com.java2blog.output.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupAnagram {
	public Set<String[]> getAnagramSet(String[] words) {
		Set<String[]> resultList = new HashSet<>();
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (checkWord(words[i], words[j])) {
					resultList.add(new String[] { words[i], words[j] });
				} else {
					resultList.add(new String[] { words[i] });
				}
			}
		}
		return resultList;
	}

	private boolean checkWord(String str1, String str2) {
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] str1Array = str1.toLowerCase().toCharArray();
			char[] str2Array = str2.toLowerCase().toCharArray();
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			status = Arrays.equals(str1Array, str2Array);
		}
		return status;
	}
}
