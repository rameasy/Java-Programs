package com.coding.dt.tree.bst;

import com.coding.dt.tree.binarytree.TreeNode;

/**
 * Problem statement: In a Binary Search Tree find the total number of elements
 * in a given range of numbers.
 * 
 * @author rameasy@gmail.com
 *
 */
public class BinarySearchTree {
	/**
	 * root element {@link TreeNode}
	 */
	TreeNode root;

	/**
	 * Default constructor.
	 */
	BinarySearchTree() {
		root = null;
	}

	/**
	 * This method counts the numbers available between the start and end value in
	 * the given tree.
	 * 
	 * @param node
	 * @param start
	 * @param end
	 * @return
	 */
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

	/**
	 * This method insert the data into the tree.
	 * 
	 * @param data
	 */
	public void insert(int data) {
		root = insertAndReOrder(root, data);
	}

	/**
	 * This is recursive method that tries to insert the new data passed and reorder
	 * the tree as per BST rule.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
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

	/**
	 * This is a recursive method which prints the tree based on the in order
	 * traversal method.
	 * 
	 * @param root
	 */
	void printInOrder(TreeNode root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.println(root.data);
			printInOrder(root.right);
		}
	}
}
