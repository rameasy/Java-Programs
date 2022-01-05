package com.nine.test.feature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates the Java 9 feature: Future class enhancement.
 * CompletableFuture class was introduced in Java 8 to represent the Future
 * which can be completed by setting its value and status explicity. It can be
 * used as java.util.concurrent.CompletionStage. It supports dependent functions
 * and actions which got triggered upon the future's completion. In java 9
 * CompletableFuture API has been enhanced further.
 * 
 * @author rameasy@gmail.com
 */
public class CompletableFutureFeature {
	public static void main(String args[]) {
		System.out.println(System.currentTimeMillis());
		Runnable cmd = new Runnable() {

			@Override
			public void run() {
				System.out.println("inside run");
			}
		};
		Executor exe = CompletableFuture.delayedExecutor(50000, TimeUnit.SECONDS);

		exe.execute(cmd);
		System.out.println(System.currentTimeMillis());
	}
}
