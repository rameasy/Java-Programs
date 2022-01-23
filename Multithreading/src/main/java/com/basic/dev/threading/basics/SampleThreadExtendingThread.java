package com.basic.dev.threading.basics;

public class SampleThreadExtendingThread {

	public static void main(String args[]) {
		ImplementingRunnable ir = new ImplementingRunnable();
		Thread t1 = new Thread(ir);
		t1.setName("Name :: ImplementingRunnable");
		t1.start();

		// Java 8 Anonymous thread
		Runnable task = () -> System.out.println(Thread.currentThread().getName());

		Thread t2 = new Thread(task);
		t2.setName("Name :: Anonymous Thread");
		t2.start();

	}

}

class ImplementingRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
