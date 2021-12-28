package com.coding.dt.arrays;

/**
 * Find the majority element. In this problem, majority element is defined as
 * the number that appears more than n/2 times in an array of numbers.
 *
 */
public class FindMajorityElement {

	public int getMajorityElement(int[] array) {
		if (array == null || array.length == 0) {
			return Integer.MIN_VALUE;
		}
		int count = 1, majElement = array[0];
		for(int i=1; i < array.length; i++) {
			if(array[i] != majElement) {
				count--;
			} else {
				count++;
			}
			if(count == 0) {
				majElement = array[i];
				count++;
			}
		}
		if (validateElement(array, array.length, majElement)) {
			return majElement;
		} else {
			return Integer.MIN_VALUE;
		}
	}

	public boolean validateElement(int[] array, int arrayLength, int maj) {
		int count = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (array[i] == maj) {
				count++;
			}
			if (count > arrayLength / 2) {
				return true;
			}
		}
		return false;
	}
}
