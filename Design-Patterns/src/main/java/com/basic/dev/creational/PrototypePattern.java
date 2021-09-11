package com.basic.dev.creational;

import java.util.ArrayList;
import java.util.List;

/*
 * The Prototype pattern is generally used when we have an instance of the class (prototype) and we'd like 
 * to create new objects by just copying the prototype.
 * Prototype design pattern mandates that the Object which you are copying should provide the copying feature. 
 * It should not be done by any other class. However whether to use shallow or deep copy of the Object properties 
 * depends on the requirements and its a design decision.
 * 
 */

/* When to use the Prototype design pattern in Java?
 * The Prototype pattern is used when we need to create a number of instances of a class and each instance has almost same state or has very little difference. 
 */
/*
 * Examples : java.lang.Object#clone(). Any class that  implement the java.lang.Cloneable interface.
 */
public class PrototypePattern {
	public static void main(String args[]) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}
}

class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}