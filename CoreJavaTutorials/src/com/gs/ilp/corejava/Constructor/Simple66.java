package com.gs.ilp.corejava.Constructor;

public class Simple66 {
	int empId;

	Simple66(int id) {
		empId = id;
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Simple66 s6 = new Simple66(10);
		System.out.println("Employee id is:" + s6.empId);
		Simple66 s66 = new Simple66(20);
		System.out.println("Employee id is:" + s66.empId);
		System.out.println("Main Ends");
	}
}
