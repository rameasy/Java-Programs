package com.iq.gs;

import java.util.ArrayDeque;
import java.util.Deque;

public class CalculateStockSpan {
	private static int[] calculateSpan(int[] price) {
		Deque<Integer> valueStack = new ArrayDeque<>();
		int[] priceOutput = new int[price.length];
		for (int i = 0; i < price.length; i++) {
			while (!valueStack.isEmpty() && price[valueStack.peek()] <= price[i]) {
				valueStack.pop();
			}
			priceOutput[i] = (valueStack.isEmpty()) ? (i + 1) : (i - valueStack.peek());
			valueStack.push(i);
		}
		return priceOutput;
	}

	public static void main(String[] args) {
		int[] priceInput = { 2,4,1 };
		int[] priceOutput = calculateSpan(priceInput);
		printOutput(priceOutput);
		int[] priceInput1 = { 10, 4, 5, 90, 120, 80 };
		priceOutput = calculateSpan(priceInput1);
		printOutput(priceOutput);
		int[] priceInput2 = { 10};
		priceOutput = calculateSpan(priceInput2);
		printOutput(priceOutput);
	}

	private static void printOutput(int[] priceOutput) {
		for (int result : priceOutput) {
			System.out.print(result + " ");
		}
		System.out.println();
	}
}
