package com.basic.dev.threading.es;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FixedThreadPoolExecutorExample {
	/*
	 * As its name suggests, this is an executor with a fixed number of threads. The
	 * tasks submitted to this executor are executed by the specified number of
	 * threads and if there are more tasks than the number of threads, then those
	 * tasks will be added in a queue (e.g. LinkedBlockingQueue).
	 * 
	 * An important advantage of the fixed thread pool is that applications using it
	 * degrade gracefully. To understand this, consider a web server application
	 * where each HTTP request is handled by a separate thread. If the application
	 * simply creates a new thread for every new HTTP request, and the system
	 * receives more requests than it can handle immediately, the application will
	 * suddenly stop responding to all requests when the overhead of all those
	 * threads exceed the capacity of the system. With a limit on the number of the
	 * threads that can be created, the application will not be servicing HTTP
	 * requests as quickly as they come in, but it will be servicing them as quickly
	 * as the system can sustain.
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		// Runnable, return void, nothing, submit and run the task async
		executor.submit(() -> System.out.println("I'm Runnable task."));

		// Callable, return a future, submit and run the task async
		Future<Integer> futureTask1 = executor.submit(() -> {
			System.out.println("I'm Callable task.");
			return 1 + 1;
		});
		Future<Integer> futureTask2 = executor.submit(() -> {
			System.out.println("I'm Callable task.");
			return 1 + 4;
		});
		try {

			otherTask("Before Future Result");

			// block until future returned a result,
			// timeout if the future takes more than 5 seconds to return the result
			Integer result = futureTask1.get(5, TimeUnit.SECONDS);

			System.out.println("Get future result1 : " + result);

			otherTask("After Future Result 1");
			Integer result2 = futureTask2.get(5, TimeUnit.SECONDS);
			System.out.println("Get future result2 : " + result2);
			otherTask("After Future Result 2");
		} catch (InterruptedException e) {// thread was interrupted
			e.printStackTrace();
		} catch (ExecutionException e) {// thread threw an exception
			e.printStackTrace();
		} catch (TimeoutException e) {// timeout before the future task is complete
			e.printStackTrace();
		} finally {

			// shut down the executor manually
			executor.shutdown();

		}

	}

	private static void otherTask(String name) {
		System.out.println("I'm other task! " + name);
	}

}
