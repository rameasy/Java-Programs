package com.java2blog.output.codewars;

import java.math.BigInteger;

public class PolynomialDifferentiation {
	public static void main(String args[]) {
		differentiate("-96x^4+4x^2+43", 7814);
	}

	public static BigInteger differentiate(String equation, long x) {
		BigInteger sum = BigInteger.ZERO;
		equation = reduceEquation(equation);
		System.out.println(equation);
		char[] equationArray = equation.toCharArray();
		String tempString = "";
		int i = 0;
		boolean equationStartsWithNegative = false;
		for (int j = 0; j < equationArray.length; j++) {
			char character = equationArray[j];
			String operation = "";
			tempString += character;
			i++;
			if (i == 1) {
				if (character == '-') {
					equationStartsWithNegative = true;
					continue;
				} else {
					operation = "positive";
				}
			} else if (equationArray[j - 1] == '-') {
				operation = "negative";
			} else {
				operation = "positive";
			}
			if (character == '+' || character == '-' || i == equationArray.length) {
				if (i != equationArray.length) {
					tempString = tempString.substring(0, tempString.length() - 1);
				}
				if (tempString.contains("x")) {
					BigInteger tempSum = BigInteger.ZERO;
					if (tempString.contains("^")) {
						String splitCap[] = tempString.split("\\^");
						int cap = Integer.parseInt(splitCap[1]);
						tempSum = tempSum.add(new BigInteger(String.valueOf(cap * x)));
						int prefixVal = Integer.parseInt(splitCap[0].replace("x", ""));
						tempSum = tempSum.add(new BigInteger(String.valueOf(prefixVal * cap)));
						if (operation == "positive" || equationStartsWithNegative) {
							sum = sum.add(tempSum);
							equationStartsWithNegative = false;
						} else {
							sum = sum.subtract(tempSum);
						}
						tempString = "";
					} else {
						int prefixVal = Integer.parseInt(tempString.replace("x", ""));
						if (operation == "positive" || equationStartsWithNegative) {
							sum = sum.add(new BigInteger(String.valueOf(prefixVal * x)));
							equationStartsWithNegative = false;
						} else {
							sum = sum.subtract(new BigInteger(String.valueOf(prefixVal * x)));
						}
						tempString = "";
					}
				} else {
					if (operation == "positive" || equationStartsWithNegative) {
						sum = sum.add(new BigInteger(String.valueOf(tempString)));
						equationStartsWithNegative = false;
					} else {
						sum = sum.subtract(new BigInteger(String.valueOf(tempString)));
					}
					tempString = "";
				}

			}
		}
		System.out.println(sum);
		return sum;
	}

	private static String reduceEquation(String equation) {
		char[] equationArray = equation.toCharArray();
		String finalEquation = "";
		String tempString = "";
		int i = 0;
		for (char character : equationArray) {
			tempString += character;
			i++;
			if (character == '-' && i == 1) {
				continue;
			}
			if (character == '+' || character == '-' || i == equationArray.length) {
				if (i != equationArray.length) {
					tempString = tempString.substring(0, tempString.length() - 1);
				}
				if (tempString.contains("x")) {
					if (tempString.contains("^")) {
						String splitCap[] = tempString.split("\\^");
						int cap = Integer.parseInt(splitCap[1]);
						splitCap[0] = splitCap[0].length() == 1 ? String.valueOf(1) : splitCap[0].replace("x", "");
						int prefixVal = Integer.parseInt(splitCap[0]);
						prefixVal = prefixVal * cap;
						cap--;
						if (cap > 1) {
							finalEquation += String.valueOf(prefixVal) + "x^" + String.valueOf(cap);
						} else {
							finalEquation += String.valueOf(prefixVal) + "x";
						}
						if (character == '+' || character == '-') {
							finalEquation += character;
						}
						tempString = "";
					} else {
						tempString = tempString.length() == 1 ? String.valueOf(1) : tempString.replace("x", "");
						finalEquation += tempString;
						if (character == '+' || character == '-') {
							finalEquation += character;
						}
						tempString = "";
					}
				} else {
					tempString = "";
				}
			}
		}
		if (finalEquation.endsWith("+") || finalEquation.endsWith("-")) {
			finalEquation = finalEquation.substring(0, finalEquation.length() - 1);
		}
		return finalEquation;
	}
}
