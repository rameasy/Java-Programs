package com.basic.dev.threading;

public class NumberGenerator extends Thread {
	private int number;
	private NumberUtility numberUtility;
	private boolean isEven;

	NumberGenerator(int number, boolean isEven, NumberUtility numberUtility) {
		this.number = number;
		this.isEven = isEven;
		this.numberUtility = numberUtility;
	}

	@Override
	public void run() {
		int i = isEven ? 2 : 1;
		while (i <= number) {
			if (isEven) {
				numberUtility.printEven(i);
			} else {
				numberUtility.printOdd(i);
			}
			i += 1;
		}
	}

	public static void main(String[] args) {
		NumberUtility numberUtility = new NumberUtility();
		int number = 10;
		NumberGenerator numberGeneratorEven = new NumberGenerator(number, false, numberUtility);
		NumberGenerator numberGeneratorOdd = new NumberGenerator(number, true, numberUtility);
		numberGeneratorOdd.start();
		numberGeneratorEven.start();
	}

}
