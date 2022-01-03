package com.basic.ds.adt.array;

/**
 * Implementing the Stack data structure.
 * 
 * @author rameasy@gmail.com
 * @param <T>
 */
public class GenericStack<T> {
	/**
	 * Stores the size of the stack.
	 */
	private int size = 0;
	/**
	 * Default capacity of the stack.
	 */
	private static final int DEFAULT_CAPACITY = 8;
	/**
	 * Stores the values in the stack.
	 */
	private Object data[];

	/**
	 * Default constructor
	 */
	public GenericStack() {
		data = new Object[DEFAULT_CAPACITY];
	}

	/**
	 * Parameterised constructor with custom capacity
	 * 
	 */
	public GenericStack(int customCapacity) {
		data = new Object[customCapacity];
	}

	/**
	 * Inserts the value at top of the Stack
	 * 
	 */
	public void push(T value) {
		if (data.length == size) {
			increaseCapacity();
		}
		data[size] = value;
		size++;
	}

	/**
	 * Removes the top value from the Stack
	 * 
	 * return T
	 */
	public T pop() {
		@SuppressWarnings("unchecked")
		T value = (T) data[size - 1];
		data[size - 1] = null;
		size--;
		return value;
	}

	/**
	 * Identifies the top value of the Stack
	 * 
	 * return T
	 */
	public T peek() {
		@SuppressWarnings("unchecked")
		T value = (T) data[size - 1];
		return value;
	}

	/**
	 * Increase the capacity of the size of data array
	 * 
	 */
	private void increaseCapacity() {
		Object[] tempData = new Object[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			tempData[i] = data[i];
		}
		data = tempData;
	}

	/**
	 * Returns the size of the data array
	 * 
	 * return Integer
	 */
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
