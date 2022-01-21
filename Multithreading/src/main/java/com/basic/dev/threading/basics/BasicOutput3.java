package com.basic.dev.threading.basics;

public class BasicOutput3 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Hello from " + Thread.currentThread().getName());
			}
		});
		thread.setName("Background thread");

		// The Java Virtual Machine exits when the only
		// threads running are all daemon threads.
		thread.setDaemon(true);

		thread.start();

		Thread.sleep(2000);
		System.out.println("Hello from " + Thread.currentThread().getName());
	}
}
