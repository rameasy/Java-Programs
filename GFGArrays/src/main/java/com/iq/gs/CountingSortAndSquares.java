package com.iq.gs;

import java.util.Arrays;

public class CountingSortAndSquares {

	public static void countSort(int[] array, int size) {
		int[] output = new int[size + 1];

		// Find the largest element of the array
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		int[] count = new int[max + 1];

		// Initialize count array with all zeros.
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}

		// Store the count of each element
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}

		// Store the cummulative count of each array
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		// Copy the sorted elements into original array
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}
	}

	static int countSquares(int n) {
		// A better way to write n*(n+1)*(2n+1)/6
		return (n * (n + 1) / 2) * (2 * n + 1) / 3;
	}
	static int countSquares2(int n) {
		int sum = 0;
		for(int i=1; i<= n;i++ ) {
			sum += (i * i);
		}
		return sum;
	}
	// Driver code
	public static void main(String args[]) {
		int[] data = { 4, 2, 2, 8, 3, 3, 1 };
		int size = data.length;
		countSort(data, size);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
		int n = 8;
		System.out.println("Count of squares is " + countSquares(n));
		System.out.println("Count of squares is " + countSquares2(n));
	}
}
