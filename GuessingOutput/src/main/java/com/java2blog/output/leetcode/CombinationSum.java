package com.java2blog.output.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		comboSum(candidates, 0, target, new ArrayList<>(), result);
		return result;
	}

	public void comboSum(int[] candidates, int index, int target, List<Integer> combo, List<List<Integer>> result) {
		if (index == candidates.length || target < 0) {
			return;
		}
		if (target == 0) {
			List<Integer> items = new ArrayList<>();
			for (int i = 0; i < combo.size(); i++) {
				items.add(combo.get(i));
			}
			result.add(items);
			return;
		}

		// starting at i = index ensures that we don't reuse older elements in the
		// combo,
		// AND that we can reuse the starting element multiple times
		for (int i = index; i < candidates.length; i++) {
			combo.add(candidates[i]);
			comboSum(candidates, i, target - candidates[i], combo, result);
			combo.remove(combo.size() - 1);
		}

	}

	public static void main(String[] args) {

		int[] candidates = { 2, 3, 5 };
		int target = 8;
		List<List<Integer>> results = new CombinationSum().combinationSum(candidates, target);
		results.forEach(result -> {
			result.forEach(value -> {
				System.out.print(value + " ");
			});
			System.out.println();
		});
		int[][] matrix = {{1,2,3}, {4,5,6}};
		int[][] returnMatrix = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[i].length; j++) {
               returnMatrix[j][i] = matrix[i][j];
            }
        }
        
        for(int i=0; i<returnMatrix.length;i++) {
            for(int j=0; j<returnMatrix[i].length; j++) {
               System.out.print(returnMatrix[i][j]);
            }
            System.out.println();
        }

	}
}
