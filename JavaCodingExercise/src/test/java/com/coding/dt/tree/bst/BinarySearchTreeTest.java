package com.coding.dt.tree.bst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * In a Binary Search Tree find the total number of elements in a given range of
 * numbers.
 * 
 * @author rameasy
 *
 * @param <T>
 */
public class BinarySearchTreeTest {
	private static BinarySearchTree tree ;
	@BeforeClass
	public static void setUp() {
		tree = new BinarySearchTree();
		tree.insert(3);
		tree.insert(5);
		tree.insert(1);
		tree.insert(7);
		tree.insert(2);
		tree.insert(6);
		tree.insert(8);
	}
	@Test
	public void countNumbersInRange_Success() {
		assertEquals(2, tree.countNumbersInRange(tree.root, 3, 7));
	}
	@Test
	public void countNumbersInRange_Failur() {
		assertNotEquals(5, tree.countNumbersInRange(tree.root, 3, 7));
	}

}
