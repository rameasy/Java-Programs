package com.basic.dev.threading.itc;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunication {
	public static void main(String args[]) {
		Queue<Integer> sharedQ = new LinkedList<>();
		Producer p = new Producer(sharedQ);
		Consumer c = new Consumer(sharedQ);
		Thread producer = new Thread(p);
		Thread consumer = new Thread(c);
		producer.setName("Producer");
		consumer.setName("Consumer");
		producer.start();
		consumer.start();
	}
}

class Producer implements Runnable {
	private final Queue<Integer> sharedQ;

	public Producer(Queue<Integer> sharedQ) {
		// super("Producer");
		this.sharedQ = sharedQ;
	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			synchronized (sharedQ) {
				while (sharedQ.size() >= 1) {
					try {
						System.out.println("Queue is full. Please wait");
						sharedQ.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.println("Producing :: " + i);
				sharedQ.add(i);
				sharedQ.notify();
			}
		}

	}

}

class Consumer implements Runnable {
	Queue<Integer> sharedQ;

	Consumer(Queue<Integer> sharedQ) {
		// super("Consumer");
		this.sharedQ = sharedQ;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQ) {
				while (sharedQ.size() == 0) {
					try {
						System.out.println("Queue is Empty. Please wait");
						sharedQ.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int number = (int) sharedQ.poll();
				System.out.println("consuming : " + number);
				sharedQ.notify();
				// termination condition
				if (number == 3) {
					break;
				}
			}

		}
	}

}