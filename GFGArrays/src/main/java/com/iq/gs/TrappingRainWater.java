package com.iq.gs;

public class TrappingRainWater {
	public static int trap(int[] height) {
		int j = height.length-1;
        int rightMax=0;
        int leftMax=0;
        int i=0;
        int water=0;

        while(i<j) {
            if(height[i]<=height[j]) {
                leftMax = Math.max(leftMax, height[i]);
                water += leftMax - height[i];
                i++;
            }
            else{
                rightMax = Math.max(rightMax, height[j]);
                water += rightMax - height[j];
                j--;
            }
        }
        return water;
	}

	public static void main(String[] args) {
		System.out.println("Trapped water :: " + trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
		System.out.println("Trapped water :: " + trap(new int[] { 0, 0, 0, 0, 1, 0, 1 }));
		System.out.println("Trapped water :: " + trap(new int[] { 1, 8, 6, 2, 5, 4,	 8, 3, 7 }));
	}
}
