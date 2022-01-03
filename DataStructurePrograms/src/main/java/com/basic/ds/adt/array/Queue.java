package com.basic.ds.adt.array;

/**
 * Implementing the Queue data structure.
 * 
 * @author rameasy@gmail.com
 * @param <T>
 */
public class Queue<T> {
	/**
	 * Stores the size of the queue.
	 */
	private int size;
	/**
	 * Points to the front end of the queue.
	 */
	private int front;
	/**
	 * Points to the rear end of the queue.
	 */
	private int rear;
	/**
	 * Stores the actual queue size of the queue.
	 */
	private int queueSize;
	/**
	 * Stores the values in the queue.
	 */
	private Integer data[];

	/**
	 * Constructor.
	 * 
	 * @param queueSize
	 */
	public Queue(int queueSize) {
		this.queueSize = queueSize;
		data = new Integer[queueSize];
		front = this.size = 0;
		this.rear = queueSize - 1;
	}

	/**
	 * This method inserts the data in the queue at the rear end.
	 * 
	 * @param value
	 */
	public void enqueue(int value) {
		if (isFull()) {
			return;
		}
		this.rear = (this.rear + 1) % this.queueSize;
		this.data[this.rear] = value;
		this.size = this.size + 1;
	}

	/**
	 * This method delete the data in the queue at the front end.
	 * 
	 * @return
	 */
	public int dequeue() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		Integer item = this.data[this.front];
		this.front = (this.front + 1) % this.queueSize;
		this.size = this.size - 1;
		return item;
	}

	/**
	 * This method returns the front value.
	 * 
	 * @return
	 */
	public int peek() {
		return front();
	}

	/**
	 * This method returns true if the queue is full.
	 * 
	 * @return
	 */
	public boolean isFull() {
		return this.size == this.queueSize;
	}

	/**
	 * This method returns the front value.
	 * 
	 * @return
	 */
	public int front() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		return this.data[this.front];
	}

	/**
	 * This method returns the rear value.
	 * 
	 * @return
	 */
	public int rear() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		return this.data[this.rear];
	}

	/**
	 * This method returns true if the queue is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}
}
