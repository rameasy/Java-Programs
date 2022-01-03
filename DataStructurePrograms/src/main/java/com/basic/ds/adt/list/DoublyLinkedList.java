package com.basic.ds.adt.list;

/**
 * This class implements the doubly linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

	/**
	 * Points to the head node in the doubly linked list.
	 */
	private DoublyLinkedListNode<T> headNode;
	/**
	 * Points to the tail node in the doubly linked list.
	 */
	private DoublyLinkedListNode<T> tailNode;

	/**
	 * This method inserts data at the tail node of the doubly linked list.
	 * 
	 * @param data
	 */
	public void insert(T data) {
		DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(data);

		if (headNode == null) {
			headNode = tailNode = node;
		} else {
			tailNode.next = node;
			node.prev = tailNode;
			tailNode = node;
			tailNode.next = null;
		}
	}

	/**
	 * This method removes data based on the data passed in the doubly linked list.
	 * 
	 * @param data
	 */
	public void removeData(T data) {
		DoublyLinkedListNode<T> currentNode = headNode;
		DoublyLinkedListNode<T> prevNode = null;
		if (headNode != null && headNode.data == data) {
			if (headNode.next == null) {
				headNode = tailNode = null;
			} else {
				headNode = headNode.next;
			}
		}
		while (currentNode != null && currentNode.data != data) {
			// System.out.print(currentNode.data + " --> ");
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode == null)
			return;
		if (prevNode != null) {
			prevNode.next = currentNode.next;
		} else {
			currentNode = currentNode.next;
		}
	}

	/**
	 * This method removes data based on the position passed in the doubly linked
	 * list.
	 * 
	 * @param position
	 */
	public void removePosition(int position) {
		DoublyLinkedListNode<T> currentNode = headNode;
		DoublyLinkedListNode<T> prevNode = null;
		int count = 0;
		if (headNode != null && position == 0) {
			if (headNode.next == null) {
				headNode = tailNode = null;
			} else {
				headNode = headNode.next;
			}
		}
		while (currentNode != null && position != count) {
			count++;
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode == null)
			return;
		if (prevNode != null) {
			prevNode.next = currentNode.next;
		} else {
			currentNode = currentNode.next;
		}
	}

	/**
	 * This method prints the data available in the doubly linked list.
	 */
	public void printList() {
		if (headNode != null) {
			if (headNode.next == null) {
				System.out.println(headNode.data);
				return;
			}
			DoublyLinkedListNode<T> node = headNode;
			while (node.next != null) {
				System.out.print(node.data + " --> ");
				node = node.next;
			}
			System.out.println(node.data);
		} else {
			System.out.println(" --> null");
		}
	}

	public int size() {
		int count = 0;
		if (headNode != null) {
			if (headNode.next == null) {
				System.out.println(headNode.data);
				return 1;
			}
			DoublyLinkedListNode<T> node = headNode;
			while (node.next != null) {
				count++;
				node = node.next;
			}
			count++;
		}
		return count;
	}

}

/**
 * This class is the node class for doubly linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
class DoublyLinkedListNode<T> {
	/**
	 * Refers the previous node available in the list.
	 */
	DoublyLinkedListNode<T> next;
	/**
	 * Refers the next node available in the list.
	 */
	DoublyLinkedListNode<T> prev;
	/**
	 * Data stored in the node.
	 */
	T data;

	/**
	 * The constructor.
	 * 
	 * @param data
	 */
	public DoublyLinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}