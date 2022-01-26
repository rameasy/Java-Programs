package com.java2blog.output.codewars;

public class DRoot {
	public static void main(String args[]) {
		System.out.println(digital_root(493193));
	}
	public static int digital_root(int n) {
		for (;;) {
			if (n / 10 != 0) {
				n = countValue(n);
				if(n / 10 == 0) {
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
}
