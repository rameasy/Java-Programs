package com.java2blog.output.codewars;

public class SnailMatrix {
	public static int[] snail(int[][] array) {
		if (array == null || array.length == 0) {
			return new int[0];
		}
		boolean[][] traversedArray = new boolean[array.length][array.length];
		int[] resultArray = new int[array.length * array.length];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int row = 0, column = 0, di = 0;
		for (int i = 0; i < array.length * array.length; i++) {
			resultArray[i] = array[row][column];
			traversedArray[row][column] = true;
			int currentRow = row + dr[di];
			int currentColumn = column + dc[di];
			if (0 <= currentRow && currentRow < array.length && 0 <= currentColumn && currentColumn < array.length
					&& !traversedArray[currentRow][currentColumn]) {
				row = currentRow;
				column = currentColumn;
			} else {
				di = (di + 1) % 4;
				row += dr[di];
				column += dc[di];
			}
		}
		return resultArray;
	}
}
