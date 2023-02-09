package com.iq.gs;

public class ArrayRotation {
	public static void main(String[] args) {
		int d = 4;
		int[] a = { 1, 2, 3, 4, 5, 6 };

		int[] leftOutput = { 5, 6, 1, 2, 3, 4 }; // expected output
		int[] leftRes = arrayLeftRotation(a, d);
		
		// TO-DO: fix tests
		if (compareArrays(leftRes, leftOutput))
			System.out.println("Left Rotation Test Passed");
		else
			System.out.println("Left Rotation Test Failed");
		
		int[] b = { 1, 2, 3, 4, 5, 6 };
		int[] rightRes = arrayRightRotation(b, d);
		int[] rightOutput = { 3, 4, 5, 6, 1, 2 }; // expected output
		if (compareArrays(rightRes, rightOutput))
			System.out.println("Right Rotation Test Passed");
		else
			System.out.println("Right Rotation Test Failed");
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
	
	private static int[] arrayRightRotation(int[] a, int d) {
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] =a[i];
		} 
		for (int i = d; i < a.length; i++) {
			 a[i] = a[i - d];
		}
		for (int i = 0; i < d; i++) {
			a[i] = temp[i  + a.length - d];
		}
		return a;
	}
	
	private static boolean compareArrays(int[]a, int[]b) {
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i] == b[i]) {
					continue;
				} else {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
