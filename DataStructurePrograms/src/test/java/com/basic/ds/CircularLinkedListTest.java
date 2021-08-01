package com.basic.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void insertTest() {
		CircularLinkedList<Integer> cll = new CircularLinkedList<>();
		cll.insert(13);
		cll.insert(46);
		cll.insert(87);
		cll.insert(70);
		cll.printList();
		assertEquals(4, cll.size());
	}

	@Test
	public void removeDataTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		CircularLinkedList<Integer> cll = new CircularLinkedList<>();
		cll.insert(13);
		cll.insert(46);
		cll.insert(87);
		cll.insert(70);
		cll.printList();
		cll.removeData(13);
		cll.printList();
		assertEquals(3, cll.size());

	}

	@Test
	public void removePositionTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		CircularLinkedList<Integer> cll = new CircularLinkedList<>();
		cll.insert(13);
		cll.insert(46);
		cll.insert(87);
		cll.insert(70);
		cll.printList();
		cll.removePosition(2);
		cll.printList();
		cll.removePosition(0);
		cll.printList();
		assertEquals(2, cll.size());

	}
}
