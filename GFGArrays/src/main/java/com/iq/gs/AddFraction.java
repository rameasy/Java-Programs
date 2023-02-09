package com.iq.gs;

/*
 * Given two fractions passed in as int arrays,
returns the fraction which is result of adding the two input fractions
Fraction is represented as a two-element array - [ numerator, denominator ]
The returned fraction has to be in its simplest form.
Signature:
int[] addFractions ( int[] fraction1, int[] fraction2 ){
}
Test Cases:
INPUT:
fraction1 -[2, 3];
fraction2 -[1, 2];
OUTPUT: Hint- {2/3 +1/2}
result = [7,6]
 * */
public class AddFraction {
	
	public static int[] addFractions(int[] fraction1, int[] fraction2) {
		int num1 = fraction1[0];
		int num2 = fraction2[0];
		int den1 = fraction1[1];
		int den2 = fraction2[1];

		int gcd = gcd(Math.abs(den1), Math.abs(den2));
		int lcm = den1 * den2 / gcd;

		int newNumerator = (num1 * lcm / den1) + (num2 * lcm / den2);

		return reduceFraction(newNumerator, lcm);
	}

	private static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	private static int[] reduceFraction(int a, int b) {
		int gcd = gcd(a, b);
		int[] reducedFraction = new int[2];
		reducedFraction[0] = a / gcd;
		reducedFraction[1] = b / gcd;
		return reducedFraction;
	}

	public static void main(String[] args) {
		boolean isPass = true;

		int[] result = addFractions(new int[] { 2, 3 }, new int[] { 1, 2 });
		isPass &= (result[0] == 7 && result[1] == 6);

		result = addFractions(new int[] { 2, 3 }, new int[] { 1, 15 });
		isPass &= (result[0] == 11 && result[1] == 15);

		result = addFractions(new int[] { 5, 15 }, new int[] { 1, 3 });
		isPass &= (result[0] == 2 && result[1] == 3);

		result = addFractions(new int[] { -2, 3 }, new int[] { 1, 2 });
		isPass &= (result[0] == -1 && result[1] == 6);

		if (isPass) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed.");
		}
	}
}
