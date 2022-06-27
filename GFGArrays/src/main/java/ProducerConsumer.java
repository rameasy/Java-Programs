import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

	public static void main(String[] args) {
		Queue<Integer> sQueue = new LinkedList<>();
		int size = 5;
		Producer producer = new Producer(sQueue, size);
		Consumer consumer = new Consumer(sQueue, size);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}

}

class Producer implements Runnable {
	Queue<Integer> sQueue;
	int size;

	Producer(Queue<Integer> sQueue, int size) {
		this.sQueue = sQueue;
		this.size = size;
	}

	@Override
	public void run() {
		for (int i = 1; i <= size; i++) {
			synchronized (sQueue) {
				while (sQueue.size() >= 1) {
					try {
						sQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (i % 2 == 1) {
					System.out.println("Producer produced :: " + i);
				}
				sQueue.add(i);
				sQueue.notify();
			}
		}
	}
}

class Consumer implements Runnable {
	Queue<Integer> sQueue;
	int size;

	Consumer(Queue<Integer> sQueue, int size) {
		this.sQueue = sQueue;
		this.size = size;
	}

	@Override
	public void run() {
		for (;;) {
			synchronized (sQueue) {
				while (sQueue.size() == 0) {
					try {
						sQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int value = sQueue.poll();
				if (value % 2 == 0) {
					System.out.println("Consumer consumed:: " + value);
				}
				sQueue.notify();
				if (value == size - 1) {
					break;
				}
			}
		}
	}
}
