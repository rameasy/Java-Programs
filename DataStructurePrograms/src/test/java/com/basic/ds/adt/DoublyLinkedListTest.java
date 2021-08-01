package com.basic.ds.adt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.basic.ds.adt.DoublyLinkedList;

public class DoublyLinkedListTest {

	@Test
	public void insertTest() {

		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(123);
		dll.insert("abc");
		dll.insert(1.23d);
		dll.insert(6);
		dll.printList();
		assertEquals(4, dll.size());
		DoublyLinkedList<Integer> dllI = new DoublyLinkedList<Integer>();
		dllI.insert(13);
		dllI.insert(52);
		dllI.printList();
		assertEquals(2, dllI.size());

	}

	@Test
	public void removeDataTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(123);
		dll.insert("abc");
		dll.insert(1.23d);
		dll.insert(6);
		dll.removeData(123);
		dll.printList();
		assertEquals(3, dll.size());
	}

	@Test
	public void removePositionTest() {
		//Added the test cases for positive testing 
		//Code change required for negative testing
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(123);
		dll.insert("abc");
		dll.insert(1.23d);
		dll.insert(6);
		dll.removePosition(3);
		dll.printList();
		assertEquals(3, dll.size());

	}
}
