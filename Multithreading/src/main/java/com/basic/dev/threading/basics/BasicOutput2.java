package com.basic.dev.threading.basics;

public class BasicOutput2 {
	public static void main(String[] a) {
		Runnable task = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " Step A");
				System.out.println(Thread.currentThread().getName() + " Step B");
			}
		};
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.setName("thread 1");
		thread2.setName("thread 2");
		thread1.start();
		thread2.start();

		System.out.println(Thread.currentThread().getName() + " Step A");
	}
}
