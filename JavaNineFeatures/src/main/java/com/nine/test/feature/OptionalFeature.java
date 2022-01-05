package com.nine.test.feature;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class demonstrates the Java 9 feature: Optional class enhancements.
 * Optional Class was introduced in Java 8 to avoid null checks and
 * NullPointerException issues. In java 9, three new methods are added to
 * improve its functionality.
 * 
 * @author rameasy@gmail.com
 */
public class OptionalFeature {
	public static void main(String args[]) {
		System.out.println(division8(4, 2));
		System.out.println(division8(4, 0));

		Optional<Integer> opt1 = division9(4, 2);
		// If a value is present, performs the given action with the value, otherwise
		// performs the given empty-based action.
		opt1.ifPresent(x -> System.out.println("Option1: Result found = " + x));

		Optional<Integer> opt2 = division9(4, 0);
		opt2.ifPresent(x -> System.out.println("Option2: Result found: " + x));

		System.out.println("Option2: Result not found, default value = " + opt2.orElse(0));

		if (opt2.isPresent())
			System.out.println("Option2: Result found.");
		else
			System.out.println("Option2: Result not found.");

		Optional<String> opStr = Optional.of("Rams");
		Supplier<Optional<String>> supStr = () -> Optional.of("No Name");
		// or: If a value is present, returns an Optional describing the value, otherwise
		// returns an Optional produced by the supplying function.
		System.out.println(opStr.or(supStr));

		List<Optional<String>> list = Arrays.asList(Optional.empty(), Optional.of("A"), Optional.empty(),
				Optional.of("B"));

		// filter the list based to print non-empty values

		// if optional is non-empty, get the value in stream, otherwise return empty
		List<String> filteredList = list.stream().flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
				.collect(Collectors.toList());

		// Optional::stream method will return a stream of either one
		// or zero element if data is present or not.
		List<String> filteredListJava9 = list.stream().flatMap(Optional::stream).collect(Collectors.toList());

		System.out.println(filteredList);
		System.out.println(filteredListJava9);
	}

	public static Optional<Integer> division8(Integer i1, Integer i2) {
		if (i2 == 0)
			return Optional.empty();
		else {
			Integer i3 = i1 / i2;
			return Optional.of(i3);
		}
	}

	public static Optional<Integer> division9(Integer i1, Integer i2) {
		if (i2 == 0)
			return Optional.empty();
		else {
			Integer i3 = i1 / i2;
			return Optional.of(i3);
		}
	}
}
