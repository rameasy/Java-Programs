package com.nine.test.feature;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalFeature {
	public static void main(String args[]) {
		System.out.println(division8(4, 2));
		System.out.println(division8(4, 0));

		Optional<Integer> opt1 = division9(4, 2);
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
		System.out.println(opStr.or(supStr));
				
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
