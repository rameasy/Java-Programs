package com.basic.ds;

public class Queue<T> {
	private int size, front, rear, queueSize;
	private Integer data[];

	public Queue(int queueSize) {
		this.queueSize = queueSize;
		data = new Integer[queueSize];
		front = this.size = 0;
		this.rear = queueSize - 1;
	}

	public void enqueue(int value) {
		if (isFull()) {
			return;
		}
		this.rear = (this.rear + 1) % this.queueSize;
		this.data[this.rear] = value;
		this.size = this.size + 1;
	}

	public int dequeue() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		Integer item = this.data[this.front];
		this.front = (this.front + 1) % this.queueSize;
		this.size = this.size - 1;
		return item;
	}

	public int peek() {
		return front();
	}

	public boolean isFull() {
		return this.size == this.queueSize;
	}

	// Method to get front of queue
	public int front() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		return this.data[this.front];
	}

	// Method to get rear of queue
	public int rear() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		return this.data[this.rear];
	}

	public boolean isEmpty() {
		return this.size == 0;
	}
}
