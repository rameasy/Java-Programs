package com.ten.test.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This class demonstrates the Java 10 feature: copyOf static method in
 * collection classes & orElseThrow in Optional class. 
 * When called with the
 * collection it returns a unmodifiable collection type.
 * 
 * @author rameasy@gmail.com
 */
public class CopyOf {
	public static void main(String[] args) {

		List<String> actors = new ArrayList<>();
		actors.add("Jack Nicholson");
		actors.add("Marlon Brando");

		System.out.println(actors); // prints [Jack Nicholson, Marlon Brando]
		// New API added - Creates an UnModifiable List from a List.
		List<String> copyOfActors = List.copyOf(actors);
		System.out.println(copyOfActors); // prints [Jack Nicholson, Marlon Brando]

		// copyOfActors.add("Robert De Niro"); Will generate an
		// UnsupportedOperationException

		actors.add("Robert De Niro");
		System.out.println(actors); // prints [Jack Nicholson, Marlon Brando, Robert De Niro]
		System.out.println(copyOfActors); // prints [Jack Nicholson, Marlon Brando]

		// New API added - Collectors.toUnmodifiableList
		//List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
		// collect.add("Tom Hanks"); // Will generate an
		// UnsupportedOperationException

		String str = null;
		Optional<String> name = Optional.ofNullable(str);
		// New API added - is preferred option then get() method
		// when null throws NoSuchElementException
		name.orElseThrow(); // same as name.get()
	}
}
