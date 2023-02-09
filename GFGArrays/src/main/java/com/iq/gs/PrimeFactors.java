package com.iq.gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Return an array containing prime numbers whose product is x Examples:
 * primeFactorization( 6 ) == [2,3] primeFactorization( 5 ) == [5]
 * primeFactorization( 12 ) == [2,2,3] Test Cases- Input: 6 4 Output:[2,3]
 */
public class PrimeFactors {
	public static List<Integer> primeFactorization(int x) {
		List<Integer> primeFactors = new ArrayList<>();
		if (x == 1)
			return primeFactors;

		if (x % 2 == 0) {
			x /= 2;
			primeFactors.add(2);
		}

		for (int i = 3; i <= x; i += 2) {
			while (x % i == 0) {
				x /= i;
				if (!primeFactors.contains(i)) {
					primeFactors.add(i);
				}
			}
		}

		return primeFactors;
	}

	public static void main(String args[]) {

		System.out.println(primeFactorization(630));
		if (primeFactorization(6).equals(Arrays.asList(2, 3)) && primeFactorization(5).equals(Arrays.asList(5))
				&& primeFactorization(49).equals(Arrays.asList(7))
				&& primeFactorization(630).equals(Arrays.asList(2, 3, 5, 7))) {
			System.out.println("All passed");
		} else {
			System.out.println("Failed");
		}

	}
}
