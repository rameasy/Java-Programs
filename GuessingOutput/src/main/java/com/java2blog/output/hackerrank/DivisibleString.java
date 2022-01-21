package com.java2blog.output.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DivisibleString {
	public static void main(String[] args) {
		String s1 = "bcdbcdbcdbcd", t1 = "bcdbcd";
		String s2 = "bcdbcdbcd", t2 = "bcdbcd";
		String s3 = "lrbb", t3 = "lrbb";
		System.out.println(getLength(s1, t1));
		System.out.println(getLength(s2, t2));
		System.out.println(getLength(s3, t3));
	}

	private static int getLength(String s, String t) {
		List<Integer> ina = new ArrayList<>();
		ina.add(1);
		ina.add(3);
		int k = ina.stream().reduce(0, Integer::sum);
		System.out.println("ina" + ina.stream().reduce(0, Integer::sum));
		if (s.length() % t.length() > 0)
			return -1;
		double countC = 3;
		int arr = 6;
		double valC = countC / arr;
		System.out.println(valC);
		// StringBuilder sb = new StringBuilder();
		// for (int i = 0; i * t.length() < s.length(); i++) {
		// sb.append(s);
		// }
		// if (!sb.toString().equals(s))
		// return -1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= t.length(); i++) {
			String subStr = t.substring(0, i);
			while (sb.length() < t.length()) {
				sb.append(subStr);
				System.out.println(sb);
			}
			if (sb.toString().equals(t))
				return i;
			sb.setLength(0);
		}
		return -1;
	}
}
