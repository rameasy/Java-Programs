package com.nine.test.feature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

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
