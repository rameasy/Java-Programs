package com.iq.gs;

public class ContainerWithMostWater {
	public static int maxArea_sol1(int[] height) {
		int maxValue = 0;
		for (int i = 0; i < height.length; i++) {
			int currentValue = height[i];
			for (int j = i + 1; j < height.length; j++) {
				int nextValue = height[j];
				int diff = Math.min(currentValue, nextValue);
				if (maxValue < (diff * (j - i))) {
					maxValue = (currentValue * nextValue * (j - i));
				}
			}
		}
		return maxValue;
	}

	public static int maxArea(int[] height) {
		int maxValue = 0;
		for (int i = 0, j = height.length - 1; i < j;) {
			int diffValue = Math.min(height[i], height[j]) * (j - i);
			maxValue = Math.max(diffValue, maxValue);
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		System.out.println(
				"Maximum amount of water a container can store is " + maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}
}
