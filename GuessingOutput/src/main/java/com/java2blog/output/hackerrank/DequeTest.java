package com.java2blog.output.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int uniqueSum = 0;
		Set<Integer> uniqueSet = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			uniqueSet.add(num);
			if (deque.size() == m) {
				if (uniqueSet.size() > uniqueSum) {
					uniqueSum = uniqueSet.size();
				}
				int removedRecord = deque.removeFirst();
				if(!deque.contains(removedRecord)) {
					uniqueSet.remove(removedRecord);
				}
			}
		}
		System.out.println(uniqueSum);
		in.close();
	}
}
