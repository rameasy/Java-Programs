package com.java2blog.output.leetcode;

//Definition for a binary tree node. 

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
		TreeNode curr = root;
		TreeNode prev;
		while (curr != null) {
			if (curr.left != null) {
				prev = curr.left;
				while (prev.right != null) {
					prev = prev.right;
				}
				prev.right = curr.right;
				curr.right = curr.left;
				curr.left = null;
			}
			curr = curr.right;
		}
	}

	TreeNode prevNode = null;

	public void flattenRecursion(TreeNode root) {
		if (root == null)
			return;

		flattenRecursion(root.right);
		flattenRecursion(root.left);

		root.right = prevNode;
		root.left = null;
		prevNode = root;
	}

}
