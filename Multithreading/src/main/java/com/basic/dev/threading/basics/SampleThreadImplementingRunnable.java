package com.basic.dev.threading.basics;

public class SampleThreadImplementingRunnable {

	public static void main(String args[]) {
		ExtendsThread t1 = new ExtendsThread();
		t1.setName("Name :: ExtendsThread");
		t1.start();

		// Java 8 Anonymous thread
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		t2.setName("Name :: Thread");
		t2.start();

	}

	static class ExtendsThread extends Thread {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}
}