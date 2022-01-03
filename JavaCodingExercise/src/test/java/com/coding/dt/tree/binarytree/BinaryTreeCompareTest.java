package com.coding.dt.tree.binarytree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This is test class for BinaryTreeCompare class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class BinaryTreeCompareTest {
	/**
	 * This is a test method for compareBinaryTree method with success criteria.
	 */
	@Test
	public void compareBinaryTree_Success() {
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new TreeNode(Integer.valueOf(1));
		tree1.root.left = new TreeNode(Integer.valueOf(2));
		tree1.root.right = new TreeNode(Integer.valueOf(3));
		tree1.root.left.left = new TreeNode(Integer.valueOf(4));
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new TreeNode(Integer.valueOf(1));
		tree2.root.left = new TreeNode(Integer.valueOf(2));
		tree2.root.right = new TreeNode(Integer.valueOf(3));
		tree2.root.left.left = new TreeNode(Integer.valueOf(4));
		assertTrue(tree1.compareTwoTreeData(tree1.root, tree2.root));
	}

	/**
	 * This method test the compareBinaryTree method with success criteria.
	 */
	@Test
	public void compareBinaryTree_failure() {
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new TreeNode(Integer.valueOf(1));
		tree1.root.left = new TreeNode(Integer.valueOf(2));
		tree1.root.right = new TreeNode(Integer.valueOf(4));
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new TreeNode(Integer.valueOf(1));
		tree2.root.left = new TreeNode(Integer.valueOf(2));
		tree2.root.right = new TreeNode(Integer.valueOf(3));
		assertFalse(tree1.compareTwoTreeData(tree1.root, tree2.root));
	}
}