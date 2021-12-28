package com.coding.dt.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coding.dt.arrays.FindMajorityElement;

public class FindMajorityElementTest {
	@Test
	public void findMajCandidate_Success() {
		FindMajorityElement findMajorityElement = new FindMajorityElement();
		int[] arr = new int[] { 3, 2, 3, 2, 3, 3, 1, 2, 3 };
		int maj = findMajorityElement.getMajorityElement(arr);
		assertEquals(3, maj);
	}
	@Test
	public void findMajCandidate_Failure() {
		FindMajorityElement findMajorityElement = new FindMajorityElement();
		int[] arr = new int[] { 3, 2, 2, 1, 3, 3, 1, 2, 3 };
		int maj = findMajorityElement.getMajorityElement(arr);
		assertEquals(Integer.MIN_VALUE, maj);
	}
}
