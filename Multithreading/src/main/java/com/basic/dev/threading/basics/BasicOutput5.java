package com.basic.dev.threading.basics;

public class BasicOutput5 {

	public static void main(String[] args) throws InterruptedException {
		final SharedResource sharedResource = new SharedResource();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				sharedResource.updateResource();
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("trying to update shared resource");
				sharedResource.updateResource();
			}
		});

		thread1.setDaemon(true);

		thread1.start();
		Thread.sleep(1000); // 1 second

		thread2.setDaemon(true);
		thread2.start();
	}

	public static class SharedResource {

		public synchronized void updateResource() {
			try {
				Thread.sleep(10000); // 10 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
