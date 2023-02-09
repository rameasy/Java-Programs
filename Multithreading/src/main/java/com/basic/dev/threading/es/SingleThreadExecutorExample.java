package com.basic.dev.threading.es;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SingleThreadExecutorExample {
	/*
	 * This executor has only one thread and is used to execute tasks in a
	 * sequential manner. If the thread dies due to an exception while executing the
	 * task, a new thread is created to replace the old thread and the subsequent
	 * tasks are executed in the new thread.
	 */

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

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
