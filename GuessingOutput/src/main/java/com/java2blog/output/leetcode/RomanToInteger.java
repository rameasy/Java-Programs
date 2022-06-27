package com.java2blog.output.leetcode;

public class RomanToInteger {
	
	private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	
	public static final String integerToRoman2(int number) {

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (number >= values[i]) {
				number -= values[i];
				s.append(romanLiterals[i]);
			}
		}
		return s.toString();
	}
	public int romanToInt(String s) {
		int result = 0;
		char previous = ' ';
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
			case 'I':
				result += 1;
				break;
			case 'V':
				result += previous == 'I' ? 3 : 5;
				break;
			case 'X':
				result += previous == 'I' ? 8 : 10;
				break;
			case 'L':
				result += previous == 'X' ? 30 : 50;
				break;
			case 'C':
				result += previous == 'X' ? 80 : 100;
				break;
			case 'D':
				result += previous == 'C' ? 300 : 500;
				break;
			case 'M':
				result += previous == 'C' ? 800 : 1000;
				break;
			default:
				result += 0;
			}
			previous = ch;
		}
		return result;
	}

	public static void main(String args[]) {
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		System.out.println(new RomanToInteger().romanToInt("CCXXIV"));
		System.out.println(integerToRoman2(123));
	}
	
}
