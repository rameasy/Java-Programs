package com.java2blog.output.guessing;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<>();
		int size = 10;
		Producer p = new Producer(queue, size);
		Consumer c = new Consumer(queue, size);

		Thread producer = new Thread(p);
		Thread consumer = new Thread(c);
		producer.start();
		consumer.start();
	}
}

class Producer implements Runnable {
	Queue<Integer> sharedQueue;
	int size;

	Producer(Queue<Integer> sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.size = size;
	}

	@Override
	public void run() {
		for (int i = 1; i <= size; i++) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() >= 1) {
					try {
						sharedQueue.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				sharedQueue.add(i);
				sharedQueue.notify();
				System.out.println("Producer :: " + i);
			}
		}
	}
}

class Consumer implements Runnable {
	Queue<Integer> sharedQueue;
	int size;

	Consumer(Queue<Integer> sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.size = size;
	}

	@Override
	public void run() {
		for (;;) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() < 1) {
					try {
						sharedQueue.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				sharedQueue.notify();
				int value = sharedQueue.poll();
				System.out.println("Consumer :: " + value);
				if (value == size) {
					break;
				}
			}
		}
	}

}