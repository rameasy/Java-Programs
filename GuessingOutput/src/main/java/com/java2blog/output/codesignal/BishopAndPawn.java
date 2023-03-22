package com.java2blog.output.codesignal;

/**
 * Given the positions of a white bishop and a black pawn on the standard chess
 * board, determine whether the bishop can capture the pawn in one move.
 * 
 * The bishop has no restrictions in distance for each move, but is limited to
 * diagonal movement. Check out the example below to see how it can move: For
 * bishop = "a1" and pawn = "c3", the output should be solution(bishop, pawn) =
 * true.
 * 
 * For bishop = "h1" and pawn = "h3", the output should be solution(bishop,
 * pawn) = false.
 */
public class BishopAndPawn {

	static boolean solution(String bishop, String pawn) throws NumberFormatException {
		System.out.println(bishop.charAt(0));
		System.out.println(pawn.charAt(0));
		System.out.println(bishop.charAt(1));
		System.out.println(pawn.charAt(1));
		System.out.println(bishop.charAt(0) - pawn.charAt(0));
		System.out.println(bishop.charAt(1) - pawn.charAt(1));
		if (bishop.charAt(0) - pawn.charAt(0) == bishop.charAt(1) - pawn.charAt(1)
				|| bishop.charAt(0) - pawn.charAt(0) == -bishop.charAt(1) + pawn.charAt(1)) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		System.out.println(solution("a1", "f6"));
		System.out.println(solution("D2", "F4"));		
	}
}
