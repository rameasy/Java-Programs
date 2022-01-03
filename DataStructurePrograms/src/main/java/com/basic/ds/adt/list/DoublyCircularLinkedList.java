package com.basic.ds.adt.list;

/**
 * This class implements the doubly circular linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
public class DoublyCircularLinkedList<T> {

	/**
	 * Points to the head node in the doubly circular linked list.
	 */
	private DoublyCircularLinkedListNode<T> headNode;
	/**
	 * Points to the tail node in the doubly circular linked list.
	 */
	private DoublyCircularLinkedListNode<T> tailNode;

	/**
	 * This method inserts data at the tail node of the doubly circular linked list.
	 * 
	 * @param data
	 */
	public void insert(T data) {
		DoublyCircularLinkedListNode<T> node = new DoublyCircularLinkedListNode<>(data);

		if (headNode == null) {
			headNode = tailNode = node;
		} else {
			tailNode.next = node;
			node.prev = tailNode;
			tailNode = node;
			tailNode.next = headNode;
		}
	}

	/**
	 * This method removes data based on the data passed in the doubly circular
	 * linked list.
	 * 
	 * @param data
	 */
	public void removeData(T data) {
		DoublyCircularLinkedListNode<T> currentNode = headNode;
		DoublyCircularLinkedListNode<T> prevNode = null;
		if (headNode != null && headNode.data == data) {
			if (headNode.next == tailNode) {
				headNode = tailNode = null;
			} else {
				tailNode.next = headNode.next;
				headNode.next.prev = tailNode;
				headNode = headNode.next;
			}
			return;
		}
		while (currentNode != null && currentNode.data != data && currentNode.next != headNode) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode == null)
			return;
		if (currentNode.next == headNode && currentNode.data != data) {
			System.out.println("Not able to identify the data :: " + data);
			return;
		}
		if (prevNode != null) {
			prevNode.next = currentNode.next;
			currentNode.next.prev = prevNode;
		} else {
			currentNode = currentNode.next;
		}
	}

	/**
	 * This method removes data based on the position passed in the doubly circular
	 * linked list.
	 * 
	 * @param position
	 */
	public void removePosition(int position) {
		DoublyCircularLinkedListNode<T> currentNode = headNode;
		DoublyCircularLinkedListNode<T> prevNode = null;
		int count = 0;
		if (headNode != null && count == position) {
			if (headNode.next == tailNode) {
				headNode = tailNode = null;
			} else {
				tailNode.next = headNode.next;
				headNode.next.prev = tailNode;
				headNode = headNode.next;
			}
			return;
		}
		while (currentNode != null && count != position && currentNode.next != headNode) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			count++;
		}
		if (currentNode == null)
			return;
		if (currentNode.next == headNode && count != position) {
			System.out.println("Invalid position :: " + position);
			return;
		}
		if (prevNode != null) {
			prevNode.next = currentNode.next;
			currentNode.next.prev = prevNode;
		} else {
			currentNode = currentNode.next;
		}
	}

	/**
	 * This method prints the data available in the doubly circular linked list.
	 */
	public void printList() {
		if (headNode != null) {
			if (headNode.next == null) {
				System.out.println(headNode.data);
				return;
			}
			DoublyCircularLinkedListNode<T> node = headNode;
			while (node.next != null && node.next != headNode) {
				System.out.print(node.data + " --> ");
				node = node.next;
			}
			System.out.println(node.data + " -->  headNode[" + node.next.data + "]");
		} else {
			System.out.println(" --> null");
		}
	}

	/**
	 * This method returns the size of the doubly circular linked list.
	 */
	public int size() {
		int count = 0;
		if (headNode != null) {
			if (headNode.next == null) {
				System.out.println(headNode.data);
				return 1;
			}
			DoublyCircularLinkedListNode<T> node = headNode;
			while (node.next != null && node.next != headNode) {
				count++;
				node = node.next;
			}
			count++;
		}
		return count;
	}
}

/**
 * This class is the node class for doubly circular linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
class DoublyCircularLinkedListNode<T> {
	/**
	 * Refers the previous node available in the list.
	 */
	DoublyCircularLinkedListNode<T> next;
	/**
	 * Refers the next node available in the list.
	 */
	DoublyCircularLinkedListNode<T> prev;
	/**
	 * Data stored in the node.
	 */
	T data;

	/**
	 * The constructor.
	 * 
	 * @param data
	 */
	public DoublyCircularLinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}
