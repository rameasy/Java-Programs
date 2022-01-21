package com.java2blog.output.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return (operation) -> {
			return operation % 2 == 1;
		};
	}

	public PerformOperation isPalindrome() {
		return (operation) -> {
			int n = operation;
			int reverse = 0;
			int modVal = 0;
			while (n != 0) {
				modVal = n % 10;
				reverse = reverse * 10 + modVal;
				n = n / 10;
			}
			return (n == operation);
		};
	}

	public PerformOperation isPrime() {
		return (operation) -> {
			for (int i = 2; i < operation; i++) {
				if (operation % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

}

public class LamdaTest {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
