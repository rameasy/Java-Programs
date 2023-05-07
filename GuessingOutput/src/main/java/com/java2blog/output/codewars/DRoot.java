package com.java2blog.output.codewars;

/**
 * Digital Root or Seed Number
 * 
 * What basically is Digital Root? Now, let us understand the concept of Digital
 * Root/ Seed number in detail. Digital Root is the single number obtained by
 * adding the number successively. E.g. Digital Root of 347 = 3 + 4 + 7 = 14, 14
 * = 1 + 4 = 5. Thus, 5 is a single digit number, which is the digital root/
 * seed number of 347.
 */
public class DRoot {
	public static void main(String args[]) {
		System.out.println(digital_root(493193));
		System.out.println(addDigits(493193));
	}

	public static int digital_root(int n) {
		for (;;) {
			if (n / 10 != 0) {
				n = countValue(n);
				if (n / 10 == 0) {
					break;
				}
			} else {
				break;
			}
		}
		return n;
	}
	
	public static int countValue(int n) {
		int modValue = 0;
		for (;;) {
			modValue += n % 10;
			n = n / 10;
			if (n == 0) {
				break;
			}
		}
		return modValue;
	}

	public static int addDigits(int num) {
		if (num == 0)
			return 0;
		else if (num % 9 == 0)
			return 9;
		else
			return num % 9;
	}
}
