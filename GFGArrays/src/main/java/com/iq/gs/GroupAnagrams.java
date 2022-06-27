package com.iq.gs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
	public static String[] group(String[] input) {
		final String[] output = new String[input.length];
		Map<String, StringBuilder> resultMap = new HashMap<>();
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] != null) {

				char[] charArray1 = input[i].toCharArray();
				Arrays.sort(charArray1);
				for (int j = i; j < input.length - 1; j++) {
					if (input[j] != null) {

						char[] charArray2 = input[j].toCharArray();
						Arrays.sort(charArray2);
						if (Arrays.compare(charArray1, charArray2) == 0) {
							StringBuilder data = resultMap.get(Arrays.toString(charArray2));
							if (data != null) {
								data.append(",");
								data.append(input[j]);
								input[j] = null;
							}
							resultMap.put(Arrays.toString(charArray2), data);
							if (input[j] != null) {
								resultMap.putIfAbsent(Arrays.toString(charArray2), new StringBuilder(input[j]));
							}
						}

					}
				}

			}
		}
		int i = 0;
		for (StringBuilder strings : resultMap.values()) {
			output[i] = strings.toString();
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "bat", "design", "toc", "signed", "cot", "tab" };
		String[] output = group(input);
		for (String result : output) {
			System.out.println(result);
		}
	}
}
