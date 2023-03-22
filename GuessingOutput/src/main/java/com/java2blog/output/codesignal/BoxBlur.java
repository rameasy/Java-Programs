package com.java2blog.output.codesignal;

import java.util.ArrayList;
import java.util.List;

/**
 * Last night you partied a little too hard. Now there's a black and white photo
 * of you that's about to go viral! You can't let this ruin your reputation, so
 * you want to apply the box blur algorithm to the photo to hide its content.
 * 
 * The pixels in the input image are represented as integers. The algorithm
 * distorts the input image in the following way: Every pixel x in the output
 * image has a value equal to the average value of the pixel values from the 3 ×
 * 3 square that has its center at x, including x itself. All the pixels on the
 * border of x are then removed.
 * 
 * Return the blurred image as an integer, with the fractions rounded down.
 * 
 * Example
 * 
 * For
 * 
 * image = [[1, 1, 1], 
 * 			[1, 7, 1], 
 * 			[1, 1, 1]] the output should be
 * solution(image) = [[1]].
 * 
 * To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 +
 * 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1. The border pixels are cropped
 * from the final result.
 * 
 * For
 * 
 * image = [[7, 4, 0, 1], 
 * 			[5, 6, 2, 2], 
 * 			[6, 10, 7, 8], 
 * 			[1, 4, 2, 0]] the output
 * should be
 * 
 * solution(image) = [[5, 4], [4, 4]] There are four 3 × 3 squares in the input
 * image, so there should be four integers in the blurred output. To get the
 * first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5. The
 * other three integers are obtained the same way, then the surrounding integers
 * are cropped from the final result.
 */
public class BoxBlur {
	static int[][] solution(int[][] image) {

		List<List<Integer>> resultList = new ArrayList<>();
		for (int i = 0; i < image.length; i++) {
			List<Integer> rows = new ArrayList<>();
			for (int j = 0; j < image[i].length; j++) {
				int value = 0;
				if (i + 2 < image.length && j + 2 < image[i].length) {
					value += image[i][j] + image[i][j + 1] + image[i][j + 2] + image[i + 1][j] + image[i + 1][j + 1]
							+ image[i + 1][j + 2] + image[i + 2][j] + image[i + 2][j + 1] + image[i + 2][j + 2];
					value = value / 9;					
					rows.add(value);
				}
				
			}
			if(!rows.isEmpty()) {
				resultList.add(rows);
			}
		}
		int [][] resultArray = new int[resultList.size()][resultList.get(0).size()];
		int j=0;
		for(List<Integer> results : resultList) {
			int[] array = new int[results.size()];
			int i = 0;
			for(Integer value: results) {
				array[i] = value;
				i++;
			}
			resultArray[j] = array;
			j++;
		}
		return resultArray;
	}
	
	public static void main(String args[]) {
		//int[][]image = {{1, 1, 1}, {1, 7, 1}, {1, 1, 1}};
		int [][]image = {{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}};
		solution(image);
	}
}
