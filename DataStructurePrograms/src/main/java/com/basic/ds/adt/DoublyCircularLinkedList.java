package com.basic.ds.adt;

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
			tailNode.next = headNode;
		}
	}

	public void removeData(T data) {
		Node currentNode = headNode;
		Node prevNode = null;
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
		if(currentNode.next == headNode && currentNode.data != data) {
			System.out.println("Not able to identify the data :: " + data);
			return;
		}
		if (currentNode == null)
			return;
		if (prevNode != null) {
			prevNode.next = currentNode.next;
			currentNode.next.prev = prevNode;
		} else {
			currentNode = currentNode.next;
		}
	}

	public void removePosition(int position) {
		Node currentNode = headNode;
		Node prevNode = null;
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
		if(currentNode.next == headNode && count != position) {
			System.out.println("Invalid position :: " + position);
			return;
		}
		if (currentNode == null)
			return;
		if (prevNode != null) {
			prevNode.next = currentNode.next;
			currentNode.next.prev = prevNode;
		} else {
			currentNode = currentNode.next;
		}	}

	public void printList() {
		if (headNode != null) {
			if (headNode.next == null) {
				System.out.println(headNode.data);
				return;
			}
			Node node = headNode;
			while (node.next != null && node.next != headNode) {
				System.out.print(node.data + " --> ");
				node = node.next;
			}
			System.out.println(node.data + " -->  headNode[" + node.next.data + "]");
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
			while (node.next != null && node.next != headNode) {
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
