package com.basic.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoublyCircularLinkedListTest {

	@Test
	public void insertTest() {

		DoublyCircularLinkedList<Integer> dcll = new DoublyCircularLinkedList<>();
		dcll.insert(23);
		dcll.insert(68);
		dcll.insert(8);
		dcll.insert(127);
		dcll.printList();
		assertEquals(4, dcll.size());

	}

	@Test
	public void removeDataTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		DoublyCircularLinkedList<Integer> dcll = new DoublyCircularLinkedList<>();
		dcll.insert(23);
		dcll.insert(68);
		dcll.insert(8);
		dcll.insert(127);
		dcll.printList();
		dcll.removeData(23);
		dcll.printList();
		assertEquals(3, dcll.size());
		dcll.removeData(83);
		dcll.printList();
		assertEquals(3, dcll.size());
		dcll.removeData(127);
		dcll.printList();
		assertEquals(2, dcll.size());
	}

	@Test
	public void removePositionTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		DoublyCircularLinkedList<Integer> dcll = new DoublyCircularLinkedList<>();
		dcll.insert(65);
		dcll.insert(34);
		dcll.insert(80);
		dcll.insert(17);
		dcll.printList();
		dcll.removePosition(3);
		dcll.printList();
		assertEquals(3, dcll.size());
		dcll.removePosition(3);
		dcll.printList();
		assertEquals(3, dcll.size());
		dcll.removePosition(1);
		dcll.printList();
		assertEquals(2, dcll.size());

	}
}
