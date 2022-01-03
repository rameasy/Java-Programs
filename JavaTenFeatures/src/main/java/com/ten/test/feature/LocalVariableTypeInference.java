package com.ten.test.feature;

import java.util.List;

public class LocalVariableTypeInference {
	public static void main(String args[]) {
		var numbers = List.of(1, 2, 3, 4, 5); // inferred value ArrayList<Integer>
		var strings = List.of("one", "two", "three"); // inferred value ArrayList<String>
		var str = "abc";
		var person = new Engineer();
		// reference - https://developers.redhat.com/blog/2018/05/25/simplify-local-variable-type-definition-using-the-java-10-var-keyword
		//str = 23; //compilation error
		//var empty = null; // compilation error
		//var z = () -> {}; // compilation error
		//person = new Doctor();//compilation error
		
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
	//public long countNumberofFiles(var fileList);// Compilation error
}


class Person {
	
}

class Engineer extends Person {
	
}
class Doctor extends Person {
	
}