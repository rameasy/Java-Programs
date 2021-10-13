package com.basic.dev.threading;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class NumberReceiver extends Thread {
	private PipedReader oddReader;
	private PipedReader evenReader;

	public NumberReceiver(PipedWriter oddWriter, PipedWriter evenWriter) {
		try {
			this.oddReader = new PipedReader(oddWriter);
			this.evenReader = new PipedReader(evenWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		int odd = 0, even = 0;
		while (odd != -1) {
			try {
				odd = oddReader.read();
				even = evenReader.read();
				if ((odd + even) % 5 == 0) {
					System.out.println("found the value even :: " + even + " && odd :: " + odd + " && total is :: "
							+ (odd + even));
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}

		}
	}
}
