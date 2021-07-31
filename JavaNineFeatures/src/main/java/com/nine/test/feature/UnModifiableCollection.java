package com.nine.test.feature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnModifiableCollection {
	public static void main(String[] args) {
		List<Integer> myList1 = new ArrayList<>();
		myList1.add(3);
		myList1.add(5);
		myList1.add(6);
		myList1.add(7);
		List<Integer> unmyList = Collections.unmodifiableList(myList1);
		myList1.add(9);
		System.out.println(unmyList);// [3, 5, 6, 7, 9]
		List<Integer> ofMyList = List.of(1,2,3,4,5,6,7,8,9,10,11, 12, 13, 14, 15, 16);
		//ofMyList.remove(2);
		System.out.println(ofMyList);

		Student s1 = new Student(101, "AAAA");
		Student s2 = new Student(101, "BBBB");
		Student s3 = new Student(101, "CCCC");

		List<Student> imtList = List.of(s1, s2, s3);
		s1.setId(102);
		imtList.forEach(s -> System.out.println(s.getName() + " ::" + s.getId()));

	}
}

final class Student {
	private int id;
	private String name;

	public Student(final int id, final String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}