package com.ten.test.feature;

import java.util.List;

public class LocalVariableTypeInference {
	public static void main(String args[]) {
		var numbers = List.of(1, 2, 3, 4, 5); // inferred value ArrayList<Integer>
		var strings = List.of("one", "two", "three"); // inferred value ArrayList<String>
		// Index of Enhanced For Loop
		for (var string : strings) {
			System.out.println(string);
		}
		// Local variable declared in a loop
		for (var i = 0; i < numbers.size(); i++) {
			Integer integer = numbers.get(i);
			System.out.print(integer + " ");
		}
	}
}
