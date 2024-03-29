package com.basic.ds.adt.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is test class for LinkedList class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class LinkedListTest {
	/**
	 * This is a test method for insert method.
	 */
	//@Test
	public void insertTest() {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(123);
		linkedList.insert("abc");
		linkedList.insert(1.23d);
		linkedList.insert(6);
		linkedList.printList();
		assertEquals(4, linkedList.size());
	}

	/**
	 * This is a test method for removeData method.
	 */
	//@Test
	public void removeDataTest() {
		// Added the test cases for positive testing
		// Code change required for negative testing
		LinkedList linkedList = new LinkedList();
		linkedList.insert(123);
		linkedList.insert("abc");
		linkedList.insert(1.23d);
		linkedList.insert(6);
		linkedList.printList();
		System.out.println(linkedList.size());
		linkedList.removeData(6);
		linkedList.printList();
		assertEquals(3, linkedList.size());

	}

	/**
	 * This is a test method for removePosition method.
	 */
	//@Test
	public void removePositionTest() {
		// Added the test cases for positive testing
		// Code change required for negative testing
		LinkedList linkedList = new LinkedList();
		linkedList.insert(123);
		linkedList.insert("abc");
		linkedList.insert(1.23d);
		linkedList.insert(6);
		linkedList.removePosition(1);
		linkedList.printList();
		assertEquals(3, linkedList.size());

	}
	/**
	 * This is a test method for sort method.
	 */
	//@Test
	public void sortTest() {
		// Added the test cases for positive testing
		// Code change required for negative testing
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.insert(10);
		linkedList.sort();
		linkedList.printList();
		assertEquals(1, linkedList.size());
		linkedList.insert(6);
		linkedList.insert(14);
		linkedList.insert(3);
		linkedList.insert(9);
		linkedList.sort();
		linkedList.printList();
		assertEquals(5, linkedList.size());
		linkedList.printReverse(linkedList.node);
	}
	
	/**
	 * This is a test method for sort method.
	 */
	//@Test
	public void removeDuplicatesTest() {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.insert(1);
		linkedList.insert(1);
		linkedList.insert(1);
		linkedList.sort();
		System.out.println("removeDuplicatesTest result");
		linkedList.removeDuplicates(linkedList.node);
		assertEquals(5, linkedList.size());
	}
	
	/**
	 * This is a test method for sort method.
	 */
	@Test
	public void addTwoListsTest() {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.insert(8);
		list1.insert(1);
		list1.insert(1);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.insert(8);
		list2.insert(1);
		list2.insert(1);
		System.out.println("sum of two lists result");
		LinkedList<Integer> resultList = new LinkedList<>();
		resultList.node = resultList.addTwoLists(list1.node, list2.node);
		resultList.printList();
	}
}
