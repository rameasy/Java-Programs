package com.java2blog.output.codewars;

public class Hamming {

	public static long hamming(int n) {
		long hamming[] = new long[n];
		int i = 0;
		int j = 0;
		int k = 0;
		long x = 2, y = 3, z = 5;
		hamming[0] = 1;
		for (int index = 1; index < n; index++) {
			hamming[index] = Math.min(x, Math.min(y, z));
			if (hamming[index] == x) {
				x = 2 * hamming[++i];
			}
			if (hamming[index] == y) {
				y = 3 * hamming[++j];
			}
			if (hamming[index] == z) {
				z = 5 * hamming[++k];
			}
		}
		return hamming[n - 1];
	}
}
