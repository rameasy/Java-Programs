package com.basic.dev.threading.basics;

public class BasicOutput6 {
	/*
	 * public static void main(String[] args) throws InterruptedException { Thread
	 * thread = new Thread(() -> System.out.println("Hello from " +
	 * Thread.currentThread().getName())); thread.setName("New Thread");
	 * thread.run();
	 * 
	 * Thread.sleep(2000); }
	 */
	
	public static void main(String[] args) {
	    Thread customThread = new CustomThread();
	 
	    customThread.start();
	    customThread.setName("Custom Thread");
	}
	 
	 
	public static class CustomThread extends Thread {
	    @Override
	    public void start() {
	        System.out.println("Starting thread");
	    }
	 
	    @Override
	    public void run() {
	        System.out.println("Running on thread " + Thread.currentThread().getName());
	    }
	 }
}
