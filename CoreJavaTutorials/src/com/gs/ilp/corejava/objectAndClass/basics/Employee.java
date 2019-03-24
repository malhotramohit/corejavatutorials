package com.gs.ilp.corejava.objectAndClass.basics;

public class Employee {
	int eid = 852; // data member (or instance variable)
	String ename = "Rohit"; // data member (or instance variable)

	public static void main(String args[]) {
		Employee e = new Employee(); // Creating an object of class Employee
		System.out.println("Employee ID: " + e.eid);
		System.out.println("Name: " + e.ename);
	}
}