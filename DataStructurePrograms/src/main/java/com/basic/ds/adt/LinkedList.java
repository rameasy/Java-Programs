package com.basic.ds.adt;

public class LinkedList<T> {

	Node node;

	public void insert(T data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (this.node == null) {
			this.node = newNode;
			return;
		} else {
			Node tempNode = this.node;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}

	public void removeData(T data) {
		Node tempNode = this.node;
		Node prevNode = null;
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

	public void removePosition(int position) {
		Node tempNode = this.node;
		Node prevNode = null;
		int count = 0;
		if (tempNode != null && count == position) {
			node = tempNode.next;
			return;
		}
		while (tempNode != null && position != count) {
			count ++;
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		if (tempNode == null)
			return;
		prevNode.next = tempNode.next;
	}

	public void printList() {
		Node tempNode = this.node;
		while (tempNode.next != null) {
			System.out.print(tempNode.data + " --> ");
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data + " --> null");
	}

	public int size() {
		int count = 0;
		Node tempNode = this.node;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			count++;
		}
		count++;
		return count;
	}

	class Node<T> {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

}
