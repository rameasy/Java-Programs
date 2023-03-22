package com.java2blog.output.codesignal;

/**
 * Given two cells on the standard chess board, determine whether they have the
 * same color or not.
 * 
 * Example
 * 
 * For cell1 = "A1" and cell2 = "C3", the output should be solution(cell1,
 * cell2) = true.
 * 
 * For cell1 = "A1" and cell2 = "H3", the output should be solution(cell1,
 * cell2) = false.
 */
public class ChessBoardCellColor {
	boolean solution(String cell1, String cell2) {
		boolean isCell1Black = isBlack(cell1.toCharArray()[0], cell1.toCharArray()[1]);
		boolean isCell2Black = isBlack(cell2.toCharArray()[0], cell2.toCharArray()[1]);
		return ((isCell1Black && isCell2Black) || (!isCell1Black && !isCell2Black));
	}

	boolean isOddColumn(char col) {
		return col == 'A' || col == 'C' || col == 'E' || col == 'G';
	}

	boolean isOddRow(char row) {
		return row == '1' || row == '3' || row == '5' || row == '7';
	}

	boolean isBlack(char row, char column) {
		return (isOddColumn(row) && isOddRow(column)) || (!isOddColumn(row) && !isOddRow(column));
	}
	public static void main(String args[]) {
		 System.out.println(new ChessBoardCellColor().solution("A1", "A3"));
		 System.out.println(new ChessBoardCellColor().solution("A1", "A2"));
		 System.out.println(('1' -'0'));
	}
}
