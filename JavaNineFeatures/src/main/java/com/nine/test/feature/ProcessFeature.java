package com.nine.test.feature;

public class ProcessFeature {
	public static void main(String args[]) {
		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println("Current Process Id: = " + currentProcess.pid());
		System.out.println("Process Info: = " + currentProcess.info());
	}
}
