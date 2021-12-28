package com.coding.dt.tree.binarytree;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public Integer data;

	public TreeNode(Integer data) {
		this.data = data;
		this.left = this.right = null;
	}
}