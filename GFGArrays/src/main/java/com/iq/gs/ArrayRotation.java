package com.iq.gs;

public class ArrayRotation {
	public static void main(String[] args) {
		int d = 4;
		int[] a = { 1, 2, 3, 4, 5, 6 };

		int[] output = { 5, 6, 1, 2, 3, 4 }; // expected output

		int[] res = arrayLeftRotation(a, d);

		// TO-DO: fix tests
		if (res == output)
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
	}

	private static int[] arrayLeftRotation(int[] a, int d) {
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] =a[i];
		} 
		for (int i = d; i < a.length; i++) {
			a[i - d] = a[i];
		}
		for (int i = 0; i < d; i++) {
			a[i + a.length - d] = temp[i];
		}
		return a;
	}
}
