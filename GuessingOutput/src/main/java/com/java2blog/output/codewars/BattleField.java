package com.java2blog.output.codewars;

public class BattleField {

	private static final int TOTAL_BATTLESHIP_COUNT = 1;
	private static final int TOTAL_CRUISER_COUNT = 2;
	private static final int TOTAL_DESTROYERS_COUNT = 3;
	private static final int TOTAL_SUBMARINE_COUNT = 4;
	int submarineCount = 0;
	int battleshipCount = 0;
	int cruiseCount = 0;
	int destroyersCount = 0;
	public static boolean fieldValidator(int[][] field) {
		BattleField bf = new BattleField();
		boolean visitedCell[][] = new boolean[field.length][field.length];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				if (visitedCell[i][j] == false) {
					validateShipExistence(field, i, j, visitedCell, bf);
				}
			}
		}
		System.out.println(bf.battleshipCount);
		System.out.println(bf.cruiseCount);
		System.out.println(bf.destroyersCount);
		System.out.println(bf.submarineCount);
		System.out.println();
		
		if (bf.battleshipCount == TOTAL_BATTLESHIP_COUNT && bf.cruiseCount == TOTAL_CRUISER_COUNT
				&& bf.destroyersCount == TOTAL_DESTROYERS_COUNT && bf.submarineCount == TOTAL_SUBMARINE_COUNT) {
			return true;
		}
		return false;
	}

	private static void validateShipExistence(int[][] field, int i, int j, boolean[][] visitedCell,
			BattleField bf) {
		if (checkForBattleship(field, i, j, visitedCell)) {
			bf.battleshipCount++;
		} else if (checkForCruiser(field, i, j, visitedCell)) {
			bf.cruiseCount++;
		} else if (checkForDestroyer(field, i, j, visitedCell)) {
			bf.destroyersCount++;
		} else if (checkForSubmarine(field, i, j, visitedCell)) {
			bf.submarineCount++;
		}
	}

	private static boolean checkForSubmarine(int[][] field, int i, int j, boolean[][] visitedCell) {
		if (field[i][j] == 1) {
			visitedCell[i][j] = true;
			return true;
		} else if (field[i][j] == 1) {
			visitedCell[i][j] = true;
			return true;
		}
		return false;
	}

	private static boolean checkForDestroyer(int[][] field, int i, int j, boolean[][] visitedCell) {
		if (visitedCell.length > i + 1) {
			if (field[i][j] == 1 && field[i + 1][j] == 1) {
				visitedCell[i][j] = true;
				visitedCell[i + 1][j] = true;
				return true;
			}
		}
		if (visitedCell.length > j + 1) {
			if (field[i][j] == 1 && field[i][j + 1] == 1) {
				visitedCell[i][j] = true;
				visitedCell[i][j + 1] = true;
				return true;
			}
		}
		return false;
	}

	private static boolean checkForCruiser(int[][] field, int i, int j, boolean[][] visitedCell) {
		if (visitedCell.length > i + 2) {
			if (field[i][j] == 1 && field[i + 1][j] == 1 && field[i + 2][j] == 1) {
				visitedCell[i][j] = true;
				visitedCell[i + 1][j] = true;
				visitedCell[i + 2][j] = true;
				return true;
			}
		}
		if (visitedCell.length > j + 2) {
			if (field[i][j] == 1 && field[i][j + 1] == 1 && field[i][j + 2] == 1) {
				visitedCell[i][j] = true;
				visitedCell[i][j + 1] = true;
				visitedCell[i][j + 2] = true;
				return true;
			}
		}
		return false;
	}

	private static boolean checkForBattleship(int[][] field, int i, int j, boolean[][] visitedCell) {
		if (visitedCell.length > i + 3) {
			if (field[i][j] == 1 && field[i + 1][j] == 1 && field[i + 2][j] == 1 && field[i + 3][j] == 1) {
				visitedCell[i][j] = true;
				visitedCell[i + 1][j] = true;
				visitedCell[i + 2][j] = true;
				visitedCell[i + 3][j] = true;
				return true;
			}
		}
		if (visitedCell.length > j + 3) {
			if (field[i][j] == 1 && field[i][j + 1] == 1 && field[i][j + 2] == 1 && field[i][j + 3] == 1) {
				visitedCell[i][j] = true;
				visitedCell[i][j + 1] = true;
				visitedCell[i][j + 2] = true;
				visitedCell[i][j + 3] = true;
				return true;
			}
		}
		return false;
	}

}
