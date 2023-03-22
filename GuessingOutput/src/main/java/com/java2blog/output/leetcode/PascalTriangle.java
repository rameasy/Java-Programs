package com.java2blog.output.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void printPascalTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			int line = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(line + " ");
				line = line * (i - k) / k;
			}

			System.out.println();
		}
	}

	private static void pascalTriangle_Recursion(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
			}

			System.out.println();
		}
	}

	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<>();
		row.add(1);
		for (int i = 1; i < rowIndex; i++) {
			for (int j = i - 1; j >= 1; j--) {
				row.set(j, row.get(j - 1) + row.get(j));
			}
			row.add(1);
		}
		return row;
	}

	public static void main(String[] args) {
		printPascalTriangle(5);

		pascalTriangle_Recursion(5);
		System.out.println(getRow(3));
	}
}
