package com.basic.ds.adt.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is test class for Sorted LinkedList class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class SortedLinkedListTest {
	/**
	 * This is a test method for insert method.
	 */
	@Test
	public void insertTest() {
		SortedLinkedList sll = new SortedLinkedList();
		sll.insert(8);
		sll.insert(5);
		sll.insert(11);
		sll.insert(6);
		sll.insert(1);
		sll.insert(7);
		sll.insert(13);
		sll.printList();
		assertEquals(7, sll.size());
	}
}
