package com.basic.ds.adt.tree;

import org.junit.Test;

public class BinaryTreeTests {
	@Test
	public void addTest() {
		BinaryTree bt = new BinaryTree();
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

	}
}
