package com.basic.dev.threading.basics;

public class BasicOutput4 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> System.out
				.println(Thread.currentThread().getName() + " is doing work at the state " + Thread.currentThread().getState()));

		thread.setName("thread1");

		thread.start();
		Thread.sleep(5000);

		System.out.println(thread.getName() + " is now in the " + thread.getState() + " state");
	}
}
