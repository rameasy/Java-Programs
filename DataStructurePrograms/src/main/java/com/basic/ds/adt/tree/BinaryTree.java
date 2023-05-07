package com.basic.ds.adt.tree;

import java.util.ArrayDeque;
import java.util.Stack;

public class BinaryTree {
	Node root;

	public void add(int value) {
		root = addRecursion(root, value);
	}

	public Node addRecursion(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursion(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursion(current.right, value);
		} else {
			return current;
		}
		return current;
	}

	public void inOrderWithoutRecursion() {
		Stack<Node> nodes = new Stack<>();
		Node current = root;

		while (!nodes.isEmpty() || current != null) {
			if (current != null) {
				nodes.push(current);
				current = current.left;
			} else {
				Node node = nodes.pop();
				System.out.printf("%s ", node.value);
				current = node.right;
			}

		}
	}
}

class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
		right = null;
		left = null;
	}
}