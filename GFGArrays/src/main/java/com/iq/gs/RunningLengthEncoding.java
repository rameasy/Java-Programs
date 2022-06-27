package com.iq.gs;

public class RunningLengthEncoding {
	public static String encode(String string) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char previousChar = string.charAt(0);
		for (int i = 1; i < string.length(); i++) {
			char currentChar = string.charAt(i);
			if (previousChar == currentChar) {
				count++;
			} else {
				sb.append(previousChar).append(count);
				count = 1;
			}
			previousChar = currentChar;
		}
		return sb.append(previousChar).append(count).toString();
	}

	public static void main(String[] args) {
		System.out.println("Reverse value of abc is " + encode("VVYROOOQLL"));
		System.out.println("Reverse value of reverse is " + encode("BBBGGFSO"));
		System.out.println("Reverse value of madam is " + encode("SUUORNWAAE"));

	}
}
