package com.basic.ds.sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is test class for SelectionSort class.
 * 
 * @author rameasy@gmail.com
 *
 */
public class SelectionSortTest {
	/**
	 * This is a test method for selectionSort method.
	 */
	@Test
	public void selectionSortTest() {
		int[] inputArray = { 23, 6, 43, 98, 79, 2, 34, 93, 21, 15, 68, 55 };
		SelectionSort ss = new SelectionSort();
		int[] sortedArray = ss.selectionSort(inputArray);
		int[] expectedArray = { 2, 6, 15, 21, 23, 34, 43, 55, 68, 79, 93, 98 };
		for (int i = 0; i < sortedArray.length; i++) {
			assertEquals(expectedArray[i], sortedArray[i]);
		}
	}

}
