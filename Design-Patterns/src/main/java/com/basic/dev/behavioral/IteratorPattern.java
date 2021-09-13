package com.basic.dev.behavioral;

import java.util.Iterator;

import com.basic.dev.behavioral.iterator.NamesRepository;

/*
 * Iterator pattern is used to get a way to access the elements of a collection object in sequential manner without 
 * any need to know its underlying representation.
 */

/* When to use the Iterator design pattern in Java?
 * We are able to access elements of a collection without exposing the internal structure of elements or collection itself.
 * Iterator supports multiple simultaneous traversals of a collection from start to end in forward, backward or both directions.
 * Iterator provide a uniform interface for traversing different collection types transparently.
 */
/*
 * Examples :
 * 
 */
public class IteratorPattern {
	public static void main(String args[]) {
		NamesRepository repository = new NamesRepository();
		Iterator<String> repositoryIterator = repository.getIterator();
		while (repositoryIterator.hasNext()) {
			System.out.println("Hi! " + repositoryIterator.next());
		}
		// or in an easier way by using for each loop
		String[] names = repository.getNames();
		for (String name : names) {
			System.out.println("Hello! " + name);
		}
	}
}
