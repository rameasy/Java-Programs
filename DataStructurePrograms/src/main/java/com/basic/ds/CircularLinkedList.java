package com.basic.ds;

import com.basic.ds.LinkedList.Node;

public class CircularLinkedList<T> {

	Node tempNode;
	Node headNode;

	public void insert(T data) {
		Node newNode = new Node(data);
		if (this.headNode == null) {
			this.headNode = newNode;
		} else {
			tempNode.next = newNode;
		}
		tempNode = newNode;
		tempNode.next = headNode;
	}

	public void removeData(T data) {
		if (headNode != null && headNode.data == data) {
			headNode = tempNode.next = headNode.next;
			return;
		}
		
		Node currentNode = this.headNode;
		Node prevNode = null;
		while (headNode.next != null && !currentNode.next.equals(headNode) && currentNode.data != data) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if ( currentNode.data != data) {
			System.out.println("cannot find the data :: " + data);
			return;
		}
		prevNode.next = currentNode.next;
	}

	public void removePosition(int position) {
		int count=0;
		if(headNode == null) {
			System.out.println("Operation not possible");
		}
		if (headNode != null && position == count) {
			headNode = tempNode.next = headNode.next;
			return;
		}
		
		Node currentNode = this.headNode;
		Node prevNode = null;
		while (headNode.next != null && !currentNode.next.equals(headNode) && position != count) {
			count++;
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if ( position != count) {
			System.out.println("Invalid position :: " + position);
			return;
		}
		prevNode.next = currentNode.next;
	}

	public void printList() {
		Node printNode = this.headNode;
		while (headNode.next != null && !printNode.next.equals(headNode)) {
			System.out.print(printNode.data + " --> ");
			printNode = printNode.next;
		}
		System.out.println(printNode.data + " --> head node [" + printNode.next.data + "]");
	}

	public int size() {
		int count = 0;
		Node printNode = this.headNode;
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

	class Node<T> {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

}
