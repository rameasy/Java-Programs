package com.java2blog.output.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfArrays = sc.nextInt();
		System.out.println("numberOfArrays is " + numberOfArrays);
		List<List<Integer>> finalList = new ArrayList<>(numberOfArrays);
		for (int i = 0; i < numberOfArrays; i++) {
			int numberOfRecords = sc.nextInt();
			List<Integer> tempArrayList = new ArrayList<>(numberOfRecords);
			for (int j = 0; j < numberOfRecords; j++) {
				tempArrayList.add(sc.nextInt());
			}
			finalList.add(tempArrayList);
		}
		int numberOfQueries = sc.nextInt();
		int[][] queryArray = new int[numberOfQueries][2];
		for (int i = 0; i < numberOfQueries; i++) {
			for (int j = 0; j < 2; j++) {
				// queryArray[i][0] = sc.nextInt();
				queryArray[i][j] = sc.nextInt();
			}
		}
		for (int k = 0; k < numberOfQueries; k++) {
			int i = queryArray[k][0];
			int j = queryArray[k][1];
			if (finalList.get(i).size() < j) {
				System.out.println("ERROR!");
			} else {
				System.out.println(finalList.get(i).get(j));
			}
		}
		sc.close();
	}
}
