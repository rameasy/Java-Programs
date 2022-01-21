package com.java2blog.output.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Studen {
	private int id;
	private String fname;
	private double cgpa;

	public Studen(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Studen> {

	@Override
	public int compare(Studen o1, Studen o2) {
		if(o1.getCgpa() < o2.getCgpa() ) {
			return 1;
		} else if(o1.getCgpa() > o2.getCgpa() ) {
			return -1;
		} else {
			if(o1.getFname().compareTo(o2.getFname()) == 1) {
				return 1;
			} else if(o1.getFname().compareTo(o2.getFname()) == -1) {
				return -1;
			} else {
				return Integer.compare(o1.getId(), o2.getId());
			}
		}
	}
	
}
//Complete the code
public class StudentSorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Studen> studentList = new ArrayList<Studen>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Studen st = new Studen(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new StudentComparator());
		for (Studen st : studentList) {
			System.out.println(st.getFname());
		}
		in.close();
	}
}
