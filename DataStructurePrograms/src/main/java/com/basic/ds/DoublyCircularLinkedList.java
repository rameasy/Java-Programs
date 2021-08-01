package com.basic.ds;

public class DoublyCircularLinkedList<T> {

	Node headNode, tailNode;

	public void insert(T data) {
		Node node = new Node(data);

		if (headNode == null) {
			headNode = tailNode = node;
		} else {
			tailNode.next = node;
			node.prev = tailNode;
			tailNode = node;
			tailNode.next = null;
		}
	}

	public void removeData(T data) {
		Node currentNode = headNode;
		Node prevNode = null;
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

	public void removePosition(int position) {
		Node currentNode = headNode;
		Node prevNode = null;
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

	public void printList() {
		if (headNode != null) {
			if (headNode.next == null) {
				System.out.println(headNode.data);
				return;
			}
			Node node = headNode;
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
			Node node = headNode;
			while (node.next != null) {
				count++;
				node = node.next;
			}
			count++;
		}
		return count;
	}

	class Node<T> {
		Node next;
		Node prev;
		T data;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

}
