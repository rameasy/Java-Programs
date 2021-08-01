package com.basic.ds.sorting;

public class SelectionSort {

	public int[] selectionSort(int[] inputArray) {
		for (int i = 0; i < inputArray.length-1; i++) {
			int lowestValue=i;
			for (int j = i+1; j < inputArray.length; j++) {
				if(inputArray[lowestValue] > inputArray[j]) {
					lowestValue =  j;
				}
			}
			int temp = inputArray[lowestValue];
			inputArray[lowestValue] = inputArray[i];
			inputArray[i] = temp;
		}
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ", ");
			
		}
		return inputArray;
	}
}
