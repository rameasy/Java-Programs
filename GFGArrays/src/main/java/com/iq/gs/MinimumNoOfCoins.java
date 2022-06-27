package com.iq.gs;

import java.util.Arrays;

public class MinimumNoOfCoins {
	static int minCoins(int coins[], int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);

		dp[0] = 0;
		for (int i = 0; i < dp.length; i++) {
			for (int coin : coins) {
				if (i - coin < 0) {
					continue;
				}
				dp[i] = Math.min(dp[i], dp[i - coin] + 1);
			}
		}
		return (dp[amount] == amount + 1) ? -1 : dp[amount];

	}

	static int coinChange(int coins[], int sum) {
		if (sum == 0) {
			return 0;
		}
		if (sum < 0) {
			return Integer.MAX_VALUE;
		}
		int coin = Integer.MAX_VALUE;
		for (int i : coins) {
			int result = coinChange(coins, sum - i);
			if (result != Integer.MAX_VALUE) {
				coin = Math.min(coin, result + 1);
			}
		}
		return coin;
	}

	public static void main(String[] args) {
		int[] coins =  {1, 5, 10, 25};
		System.out.println("Minimum coins required is " + minCoins(new int[] { 9, 6, 5, 1 }, 12));
		System.out.println("Minimum coins required is " + coinChange(new int[] { 9, 6, 5, 1 }, 12));
		 System.out.println("Test #1");
	       System.out.println("Minimum coins required is "+ minCoins(coins, 11) ); // Should be 2
	       System.out.println("Minimum coins required is "+ minCoins(coins, 30) ); // Should be 2
	       System.out.println("Minimum coins required is "+ minCoins(coins, 87) ); // Should be 6
	       System.out.println("Minimum coins required is "+ minCoins(coins, 98) ); // Should be 8
	      
	      coins = new int[]{2,4,5};
	      
	      System.out.println("Test #2");
	      System.out.println("Minimum coins required is "+ minCoins(coins, 8) ); // Should be 2
	      System.out.println("Minimum coins required is "+ minCoins(coins, 6) ); // Should be 2
	      System.out.println("Minimum coins required is "+ minCoins(coins, 3) ); // Should be -1
		
	}
}
