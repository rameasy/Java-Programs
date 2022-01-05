package com.nine.test.feature;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class demonstrates the Java 9 feature: Stream enhancements.
 * 
 * @author rameasy@gmail.com
 */
public class StreamFeature {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream.forEach(x -> System.out.print(x + " ")); // java 8
		System.out.println();
		// takeWhile method takes all the values until the predicate returns false. It
		// returns, in case of ordered stream, a stream consisting of the longest prefix
		// of elements taken from this stream matching the given predicate.
		Stream<Integer> streamTW = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		streamTW.takeWhile(d -> d < 4).forEach(a -> System.out.print(a + "  "));
		System.out.println();

		// dropWhile method throw away all the values at the start until the predicate
		// returns true. It returns, in case of ordered stream, a stream consisting of
		// the remaining elements of this stream after dropping the longest prefix of
		// elements matching the given predicate.
		Stream<Integer> streamDW = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		streamDW.dropWhile(d -> d < 4).forEach(a -> System.out.print(a + "  "));
		System.out.println();

		// iterate method now has hasNext predicate as parameter which stops the loop
		// once hasNext predicate returns false.
		IntStream.iterate(2, x -> x < 20, x -> x + x).forEach(a -> System.out.print(a + " "));
		System.out.println();
		// IntStream.iterate(2, x -> x + x).filter(x -> x > 20).forEach(a ->
		// System.out.print(a + " "));

		// ofNullable method is introduced to prevent NullPointerExceptions and to avoid
		// null checks for streams. This method returns a sequential Stream containing
		// single element, if non-null, otherwise returns an empty Stream.
		Stream<Integer> s1 = Stream.ofNullable(1);
		s1.forEach(a -> System.out.print(a + " "));
		System.out.println("Next line");
		Stream<Integer> s = Stream.ofNullable(null);
		s.forEach(a -> System.out.print(a + " "));
	}

}
