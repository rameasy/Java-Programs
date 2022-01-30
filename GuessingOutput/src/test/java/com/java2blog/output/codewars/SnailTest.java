package com.java2blog.output.codewars;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class SnailTest {

	@Test
	public void SnailTest1() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] r = { 1, 2, 3, 6, 9, 8, 7, 4, 5 };
		test(array, r);
		int[][] array1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[] r1 = { 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10 };
		test(array1, r1);
	}

	public String int2dToString(int[][] a) {
		return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
	}

	public void test(int[][] array, int[] result) {
		String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
		System.out.println(text);
		assertArrayEquals(result, SnailMatrix.snail(array));
	}

}