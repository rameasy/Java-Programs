package com.java2blog.output.codewars;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
	public static boolean check(int[][] sudoku) {
		if (sudoku.length != 9) {
			return false;
		}
		for (int i = 0; i < 9; i++) {
			if (sudoku[i].length != 9) {
				return false;
			}
		}
		Set<Integer> numbers = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sudoku[i][j] > 0 && sudoku[i][j] < 10) {
					numbers.add(sudoku[i][j]);
				} else {
					return false;
				}
			}
			if (numbers.size() != 9) {
				return false;
			}
			numbers.clear();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				numbers.add(sudoku[j][i]);
			}
			if (numbers.size() != 9) {
				return false;
			}
			numbers.clear();
		}
		for (int i = 0; i < 7; i += 3) {
			for (int j = 0; j < 7; j += 3) {
				numbers.add(sudoku[i][j]);
				numbers.add(sudoku[i + 1][j]);
				numbers.add(sudoku[i + 2][j]);
				numbers.add(sudoku[i][j + 1]);
				numbers.add(sudoku[i + 1][j + 1]);
				numbers.add(sudoku[i + 2][j + 1]);
				numbers.add(sudoku[i][j + 2]);
				numbers.add(sudoku[i + 1][j + 2]);
				numbers.add(sudoku[i + 2][j + 2]);
				if (numbers.size() != 9) {
					return false;
				}
				numbers.clear();
			}
		}
		return true;
	}
}