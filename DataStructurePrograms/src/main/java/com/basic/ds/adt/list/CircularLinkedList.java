package com.basic.ds.adt.list;

/**
 * This class implements the circular linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
public class CircularLinkedList<T> {
	/**
	 * Points to the head node in the circular linked list.
	 */
	private CircularLinkedListNode<T> headNode;
	/**
	 * Points to the temp node in the circular linked list.
	 */
	private CircularLinkedListNode<T> tempNode;

	/**
	 * This method inserts data at the temp node of the circular linked list.
	 * 
	 * @param data
	 */
	public void insert(T data) {
		CircularLinkedListNode<T> newNode = new CircularLinkedListNode<T>(data);
		if (this.headNode == null) {
			this.headNode = newNode;
		} else {
			tempNode.next = newNode;
		}
		tempNode = newNode;
		tempNode.next = headNode;
	}

	/**
	 * This method removes data based on the data passed in the circular linked
	 * list.
	 * 
	 * @param data
	 */
	public void removeData(T data) {
		if (headNode != null && headNode.data == data) {
			headNode = tempNode.next = headNode.next;
			return;
		}

		CircularLinkedListNode<T> currentNode = this.headNode;
		CircularLinkedListNode<T> prevNode = null;
		while (headNode.next != null && !currentNode.next.equals(headNode) && currentNode.data != data) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode.data != data) {
			System.out.println("cannot find the data :: " + data);
			return;
		}
		prevNode.next = currentNode.next;
	}

	/**
	 * This method removes data based on the position passed in the circular linked
	 * list.
	 * 
	 * @param position
	 */
	public void removePosition(int position) {
		int count = 0;
		if (headNode == null) {
			System.out.println("Operation not possible");
		}
		if (headNode != null && position == count) {
			headNode = tempNode.next = headNode.next;
			return;
		}

		CircularLinkedListNode<T> currentNode = this.headNode;
		CircularLinkedListNode<T> prevNode = null;
		while (headNode.next != null && !currentNode.next.equals(headNode) && position != count) {
			count++;
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (position != count) {
			System.out.println("Invalid position :: " + position);
			return;
		}
		prevNode.next = currentNode.next;
	}

	/**
	 * This method prints the data available in the circular linked list.
	 */
	public void printList() {
		CircularLinkedListNode<T> printNode = this.headNode;
		while (headNode.next != null && !printNode.next.equals(headNode)) {
			System.out.print(printNode.data + " --> ");
			printNode = printNode.next;
		}
		System.out.println(printNode.data + " --> head node [" + printNode.next.data + "]");
	}

	/**
	 * This method returns the size of the circular linked list.
	 */
	public int size() {
		int count = 0;
		CircularLinkedListNode<T> printNode = this.headNode;
		if (headNode == null) {
			return 0;
		}
		while (headNode.next != null && !printNode.next.equals(headNode)) {
			printNode = printNode.next;
			count++;
		}
		count++;
		return count;
	}

	/**
	 * This method checks whether it is cyclic linkedlist.
	 */
	public boolean checkIfCyclic(CircularLinkedListNode<Integer> llist) {
		if (llist == null || llist.next == null) {
			return false;
		}
		CircularLinkedListNode<Integer> head = llist;
		CircularLinkedListNode<Integer> tail = head.next;
		while (head != tail) {
			if (tail == null || tail.next == null) {
				return false;
			}
			head = head.next;
			tail = tail.next.next;
		}
		return true;
	}
}

/**
 * This class is the node class for circular linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
class CircularLinkedListNode<T> {
	/**
	 * Refers the next node available in the list.
	 */
	CircularLinkedListNode<T> next;
	/**
	 * Data stored in the node.
	 */
	T data;

	/**
	 * The constructor.
	 * 
	 * @param data
	 */
	public CircularLinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}
