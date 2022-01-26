package com.java2blog.output.codewars;

public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		String hours = String.format("%02d", seconds / 3600);
		String minutes = String.format("%02d", (seconds / 60) % 60);
		String second = String.format("%02d", (seconds % 60));

		return hours + ":" + minutes + ":" + second;
	}

	public static void main(String args[]) {
		System.out.println(makeReadable(0));
		System.out.println(makeReadable(5));
		System.out.println(makeReadable(60));
		System.out.println(makeReadable(86399));
		System.out.println(makeReadable(359999));
	}
}
