package com.basic.ds.adt.general;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * The Class HashMapTest.
 * 
 * @author rameasy@gmail.com
 */
public class HashMapTest {
	/**
	 * This is a test method for put and get methods.
	 */
	@Test
	public void putAndGetTest() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.print();
		assertEquals("One", map.get(1));
	}
	
	/**
	 * This is a test method for remove method.
	 */
	@Test
	public void removeTest() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.print();
		map.remove(2);
		map.print();
		assertEquals("Three", map.get(3));
		assertNull(map.get(2));
	}
}
