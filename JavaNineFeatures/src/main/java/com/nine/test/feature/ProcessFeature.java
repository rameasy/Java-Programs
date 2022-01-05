package com.nine.test.feature;

public class ProcessFeature {
	/**
	 * This class demonstrates the Java 9 feature: Process enhancements.
	 * 
	 * @author rameasy@gmail.com
	 */
	public static void main(String args[]) {
		/*
		 * ProcessHandle Class now provides process's native process ID, start time,
		 * accumulated CPU time, arguments, command, user, parent process, and
		 * descendants. ProcessHandle class also provides method to check processes'
		 * liveness and to destroy processes. It has onExit method, the
		 * CompletableFuture class can perform action asynchronously when process exits.
		 */
		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println("Current Process Id: = " + currentProcess.pid());
		System.out.println("Process Info: = " + currentProcess.info());
	}
}
