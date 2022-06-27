package com.basic.ds.recursion;

public class MinimumPathSum {

	public static int minPathSum(int[][] grid, int i, int j) {
		if (i == grid.length || j == grid[i].length) {
			return Integer.MAX_VALUE;
		}
		if (i == grid.length - 1 && j == grid[i].length - 1) {
			return grid[i][j];
		}

		return grid[i][j] + Math.min(minPathSum(grid, i + 1, j), minPathSum(grid, i, j + 1));
	}

	public static void main(String[] args) {
		System.out.println("Path sum :: " + minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }, 0, 0));
		System.out.println("Path sum :: " + minPathSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }, 0, 0));
	}
}
