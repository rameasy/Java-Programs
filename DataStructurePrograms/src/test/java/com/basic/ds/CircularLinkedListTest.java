package com.basic.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void insertTest() {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(123);
		linkedList.insert("abc");
		linkedList.insert(1.23d);
		linkedList.insert(6);
		linkedList.printList();
		assertEquals(4, linkedList.size());
	}

	@Test
	public void removeDataTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
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

	@Test
	public void removePositionTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		LinkedList linkedList = new LinkedList();
		linkedList.insert(123);
		linkedList.insert("abc");
		linkedList.insert(1.23d);
		linkedList.insert(6);
		linkedList.removePosition(1);
		linkedList.printList();
		assertEquals(3, linkedList.size());

	}
}
