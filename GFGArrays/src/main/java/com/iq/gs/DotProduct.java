package com.iq.gs;

/***
 * Problem Statementtwo arrays of integers, returns the dot product of the
 * arrays. Signature: long dotProduct( int[] array1, int array2[] ){ } Test
 * Cases: INPUT: array1 = [1, 2]; array2 = [2, 3]; OUTPUT: hint {1*2+2*3} Result
 * =[8]
 */
public class DotProduct {
	public static int dotProduct(int[] array1, int[] array2) {
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i] * array2[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2 };
		int[] array2 = { 2, 3 };
		int result = dotProduct(array1, array2);

		if (result == 8) {
			System.out.println("Passed.");
		} else {
			System.out.println("Failed.");
		}
	}
}
