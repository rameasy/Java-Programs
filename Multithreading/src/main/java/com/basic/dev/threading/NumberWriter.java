package com.basic.dev.threading;

import java.io.IOException;
import java.io.PipedWriter;

public class NumberWriter extends Thread {
	PipedWriter writer;
	int number;
	boolean isEven;

	NumberWriter(PipedWriter writer, int number, boolean isEven) {
		this.writer = writer;
		this.number = number;
		this.isEven = isEven;
	}

	@Override
	public void run() {
		int i = 1;
		while (i <= number) {
			try {
				if (isEven && (i % 2) == 0) {
					writer.write(i);
				} else if (!isEven && (i % 2) != 0) {
					writer.write(i);
				}
				i++;
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		PipedWriter writer1 = new PipedWriter();
		PipedWriter writer2 = new PipedWriter();
		int number = 10;
		NumberWriter writerOdd = new NumberWriter(writer1, number, true);
		NumberWriter writerEven = new NumberWriter(writer2, number, false);
		NumberReceiver receiver = new NumberReceiver(writer1, writer2);
		writerOdd.start();
		writerEven.start();
		receiver.start();
	}

}
