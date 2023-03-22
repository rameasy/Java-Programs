package com.java2blog.output.codesignal;

/**
 * In the popular Minesweeper game you have a board with some mines and those
 * cells that don't contain a mine have a number in it that indicates the total
 * number of mines in the neighboring cells. Starting off with some arrangement
 * of mines we want to create a Minesweeper game setup.
 * 
 * Example
 * 
 * For
 * 
 * matrix = [[true, false, false], 
 * 			 [false, true, false], 
 * 			 [false, false, false]]
 * the output should be
 * 
 * solution(matrix) = [[1, 2, 1],
 * 					   [2, 1, 1], 
 * 					   [1, 1, 1]]
 */

public class Minesweeper {
	static int[][] solution(boolean[][] matrix) {
		int[][] resultArray = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				resultArray[i][j] = 0;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//if (matrix[i][j]) {	resultArray[i][j] = 1;	} else {
				//if (matrix[i][j]) {
					checkForMineAdjacentBooleans(matrix, i, j, resultArray);
				//}
			}
		}
		return resultArray;
	}

	static void checkForMineAdjacentBooleans(boolean[][] matrix, int i, int j, int[][] resultArray) {
		int count = 0;
		if (i - 1 >= 0) {
			if (j - 1 >= 0 && matrix[i - 1][j - 1]) {
				count++;
			}
			if (matrix[i - 1][j]) {
				count++;
			}
			if (j + 1 < matrix[i].length && matrix[i - 1][j + 1]) {
				count++;
			}
		}
		if (j - 1 >= 0 && matrix[i][j - 1]) {
			count++;
		}
		
		if (j + 1 < matrix[i].length && matrix[i][j + 1]) {
			count++;
		}
		if (i + 1 < matrix.length) {
			if (j - 1 >= 0 && matrix[i + 1][j - 1]) {
				count++;
			}
			if (matrix[i + 1][j]) {
				count++;
			}
			if (j + 1 < matrix[i].length && matrix[i + 1][j + 1]) {
				count++;
			}
		}
		resultArray[i][j] = count;
	}

	public static void main(String args[]) {
		 //boolean[][] matrix = { { true, false, false }, { false, true, false }, {
		 //false, false, false } };
		boolean[][] matrix = { { true, false, false, true }, { false, false, true, false },
				{ true, true, false, true } };
		int result[][] = solution(matrix);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
