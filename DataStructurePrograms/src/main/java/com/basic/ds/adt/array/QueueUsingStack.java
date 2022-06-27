package com.basic.ds.adt.array;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> s1 = new Stack<Integer>();

	public void enQueue(int x) {
		Stack<Integer> s2 = new Stack<Integer>();
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	public int deQueue() {
		if (s1.isEmpty()) {
			System.out.println("Queue is empty...");
			System.exit(0);
		}
		return s1.pop();
	}

	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
