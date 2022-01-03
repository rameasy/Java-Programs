package com.coding.dt.tree.binarytree;

/**
 * Problem statement: Given two binary trees find if they are equal (have the
 * same content and structure).
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
public class BinaryTree {
	/**
	 * root element {@link TreeNode}
	 */
	TreeNode root;

	/**
	 * Default constructor.
	 */
	BinaryTree() {
		root = null;
	}

	/**
	 * This method compares two tree objects and returns true if they are same.
	 * 
	 * @param tree1
	 * @param tree2
	 * @return
	 */
	public boolean compareTwoTreeData(TreeNode tree1, TreeNode tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		}
		if (tree1 == null || tree2 == null || tree1.data != tree2.data) {
			return false;
		}
		return compareTwoTreeData(tree1.left, tree2.left) && compareTwoTreeData(tree1.right, tree2.right);
	}
}
