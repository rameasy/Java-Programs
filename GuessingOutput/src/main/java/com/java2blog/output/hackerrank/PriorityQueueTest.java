package com.java2blog.output.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student> {
	String name = new String();
	double cgpa;
	int id;

	public Student(String name, double cgpa, int id) {
		this.name = name;
		this.cgpa = cgpa;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int compareTo(Student s) {
		if (this.cgpa == s.cgpa) {
			if (this.name.compareTo(s.name) == 0) {
				if (this.id == s.id)
					return 0;
				else if (this.id > s.id)
					return 1;
				else
					return -1;
			} else
				return this.name.compareTo(s.name);
		} else if (this.cgpa > s.cgpa)
			return -1;
		else
			return 1;
	}
}

class Priorities {
	public ArrayList<Student> getStudents(List<String> events) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		for (String i : events) {
			String[] data = new String[4];
			data = i.split("\\s");
			if (data.length > 1) {
				pq.add(new Student(data[1], Double.valueOf(data[2]), Integer.valueOf(data[3])));
			} else {
				pq.poll();
			}
		}
		while (pq.size() > 1) {
			System.out.println(pq.poll().name);
		}
		return new ArrayList<Student>(pq);
	}
}

public class PriorityQueueTest {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}