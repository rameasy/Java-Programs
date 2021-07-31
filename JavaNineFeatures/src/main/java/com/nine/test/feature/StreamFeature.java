package com.nine.test.feature;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFeature {

	public static void main(String[] args) {
		Integer i = 4;
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream.forEach(x -> System.out.print(x + " ")); // java 8
		System.out.println();
		Stream<Integer> streamTW = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		streamTW.takeWhile(d -> d < 4).forEach(a -> System.out.print(a + "  "));
		System.out.println();
		Stream<Integer> streamDW = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		streamDW.dropWhile(d -> d < 4).forEach(a -> System.out.print(a + "  "));
		System.out.println();
		IntStream.iterate(2, x -> x < 20, x -> x + x).forEach(a -> System.out.print(a + " "));
		System.out.println();
		//IntStream.iterate(2, x -> x + x).filter(x -> x > 20).forEach(a -> System.out.print(a + " "));
		Stream<Integer> s1 = Stream.ofNullable(1);
		s1.forEach(a -> System.out.print(a + " "));
		System.out.println();
		Stream<Integer> s = Stream.ofNullable(null);
		s.forEach(a -> System.out.print(a + " "));
	}

}
