package com.basic.dev.threading;

public class NumberUtility {

	private boolean isOddPrinted = false;

	public synchronized void printOdd(int number) {
		while (isOddPrinted) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		isOddPrinted = false;
		System.out.println("Number :: " + number);
		notify();
	}

	public synchronized void printEven(int number) {
		while (!isOddPrinted) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		isOddPrinted = true;
		System.out.println("Number :: " + number);
		notify();
	}
}
