package com.coding.dt.tree.binarytree;

/**
 * This is a data structure class for Tree. Left tree node.
 * 
 * @author rameasy@gmail.com
 *
 */
public class TreeNode {

	/**
	 * Left tree node.
	 */
	public TreeNode left;
	/**
	 * Right tree node.
	 */
	public TreeNode right;
	/**
	 * The data value in the node.
	 */
	public Integer data;

	/**
	 * The constructor for the class.
	 * 
	 * @param data
	 */
	public TreeNode(Integer data) {
		this.data = data;
		this.left = this.right = null;
	}
}