package com.coding.dt.tree.bst;

import com.coding.dt.tree.binarytree.TreeNode;

/**
 * In a Binary Search Tree find the total number of elements in a given range of
 * numbers.
 * 
 * @author rameasy
 *
 * @param <T>
 */
public class BinarySearchTree {
	TreeNode root;

	BinarySearchTree() {
		root = null;
	}

	public int countNumbersInRange(TreeNode node, int start, int end) {
		if (node == null) {
			return 0;
		}
		if ((node.data > start) && (node.data < end)) {
			return 1 + countNumbersInRange(node.left, start, end) + countNumbersInRange(node.right, start, end);
		} else if (node.data >= end) {
			return countNumbersInRange(node.left, start, end);
		} else {
			return countNumbersInRange(node.right, start, end);
		}
	}

	public void insert(int data) {
		root = insertAndReOrder(root, data);
	}

	private TreeNode insertAndReOrder(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}
		if (data < root.data)
			root.left = insertAndReOrder(root.left, data);
		else if (data > root.data)
			root.right = insertAndReOrder(root.right, data);
		return root;
	}

	void printInOrder(TreeNode root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.println(root.data);
			printInOrder(root.right);
		}
	}
}
