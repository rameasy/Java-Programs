package com.basic.ds.adt;

/**
 * Implementing the Stack data structure
 * 
 */
public class IntegerStack {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 8;
	private Integer data[];

	/**
	 * Default constructor
	 */
	public IntegerStack() {
		data = new Integer[DEFAULT_CAPACITY];
	}

	/**
	 * Parameterised constructor with custom capacity
	 * 
	 */
	public IntegerStack(int customCapacity) {
		data = new Integer[customCapacity];
	}

	/**
	 * Inserts the value at top of the Stack
	 * 
	 * return Integer
	 */
	public void push(Integer value) {
		if (data.length == size) {
			increaseCapacity();
		}
		data[size] = value;
		size++;
	}

	/**
	 * Removes the top value from the Stack
	 * 
	 * return Integer
	 */
	public Integer pop() {
		Integer value = data[size - 1];
		data[size - 1] = null;
		size--;
		return value;
	}

	/**
	 * Identifies the top value of the Stack
	 * 
	 * return Integer
	 */
	public Integer peek() {
		Integer value = data[size - 1];
		return value;
	}

	/**
	 * Increase the capacity of the size of data array
	 * 
	 * return Integer[]
	 */
	private Integer[] increaseCapacity() {
		Integer[] tempData = new Integer[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			tempData[i] = data[i];
		}
		data = tempData;
		return data;
	}

	public Integer size() {
		return data.length;
	}

	/**
	 * Returns the elements in the data in the string format
	 * 
	 * return String
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < size; i++) {
			sb.append(data[i].toString());
			if (i < size - 1) {
				sb.append(",");
			}
		}
		sb.append(']');
		return sb.toString();
	}
}
