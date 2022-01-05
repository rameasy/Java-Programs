package com.basic.ds.adt.list;

/**
 * This class implements the linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
public class LinkedList<T> {
	/**
	 * Points to the node in the linked list.
	 */
	LinkedListNode<T> node;

	/**
	 * This method inserts data at the temp node of the linked list.
	 * 
	 * @param data
	 */
	public void insert(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<>(data);
		newNode.next = null;
		if (this.node == null) {
			this.node = newNode;
			return;
		} else {
			LinkedListNode<T> tempNode = this.node;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}

	/**
	 * This method removes data based on the data passed in the linked list.
	 * 
	 * @param data
	 */
	public void removeData(T data) {
		LinkedListNode<T> tempNode = this.node;
		LinkedListNode<T> prevNode = null;
		if (tempNode != null && tempNode.data == data) {
			node = tempNode.next;
			return;
		}
		while (tempNode != null && !data.equals(tempNode.data)) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		if (tempNode == null)
			return;
		prevNode.next = tempNode.next;
	}

	/**
	 * This method removes data based on the position passed in the linked list.
	 * 
	 * @param position
	 */
	public void removePosition(int position) {
		LinkedListNode<T> tempNode = this.node;
		LinkedListNode<T> prevNode = null;
		int count = 0;
		if (tempNode != null && count == position) {
			node = tempNode.next;
			return;
		}
		while (tempNode != null && position != count) {
			count++;
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		if (tempNode == null)
			return;
		prevNode.next = tempNode.next;
	}

	/**
	 * This method prints the data available in the linked list.
	 */
	public void printList() {
		LinkedListNode<T> tempNode = this.node;
		while (tempNode.next != null) {
			System.out.print(tempNode.data + " --> ");
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data + " --> null");
	}

	/**
	 * This method returns the size of the linked list.
	 */
	public int size() {
		int count = 0;
		LinkedListNode<T> tempNode = this.node;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			count++;
		}
		count++;
		return count;
	}

	/**
	 * This method sorts the linked list in ascending order.
	 */
	@SuppressWarnings("unchecked")
	public void sort() {
		LinkedListNode<Integer> currentNode = (LinkedListNode<Integer>) this.node;
		while (currentNode != null) {
			LinkedListNode<Integer> nextNode = currentNode.next;
			while (nextNode != null) {
				if (currentNode.data > nextNode.data) {
					Integer temp = currentNode.data;
					currentNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			currentNode = currentNode.next;
		}
	}
}

/**
 * This class is the node class for linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
class LinkedListNode<T> {
	/**
	 * Refers the next node available in the list.
	 */
	LinkedListNode<T> next;
	/**
	 * Data stored in the node.
	 */
	T data;

	/**
	 * The constructor.
	 * 
	 * @param data
	 */
	public LinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}