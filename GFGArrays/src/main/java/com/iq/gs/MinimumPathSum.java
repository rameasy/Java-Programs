package com.iq.gs;

public class MinimumPathSum {
	public static int minPathSum(int[][] grid) {
		for (int i = grid.length - 1; i >= 0; i--) {
			for (int j = grid[i].length - 1; j >= 0; j--) {
				if (i == grid.length - 1 && j != grid[i].length - 1) {
					grid[i][j] += grid[i][j + 1];
				} else if (i != grid.length - 1 && j == grid[i].length - 1) {
					grid[i][j] += grid[i + 1][j];
				} else if (i != grid.length - 1 && j != grid[i].length - 1) {
					grid[i][j] += Math.max(grid[i][j + 1], grid[i + 1][j]);
				}
			}
		}

		return grid[0][0];
	}

	public static int minPathSum_recursion(int[][] grid, int i, int j) {
		if (i == grid.length || j == grid[i].length) {
			return Integer.MAX_VALUE;
		}
		if (i == grid.length - 1 && j == grid[i].length - 1) {
			return grid[i][j];
		}

		return grid[i][j] + Math.min(minPathSum_recursion(grid, i + 1, j), minPathSum_recursion(grid, i, j + 1));
	}

	public static void main(String[] args) {
		System.out.println("Path sum :: " + minPathSum(new int[][] { { 2, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
		System.out.println("Path sum :: " + minPathSum_recursion(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }, 0, 0));
	}
}
