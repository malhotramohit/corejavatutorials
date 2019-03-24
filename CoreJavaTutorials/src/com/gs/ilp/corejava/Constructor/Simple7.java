package com.gs.ilp.corejava.Constructor;

public class Simple7 {
	int stdId;
	String stdName;

	Simple7(int id, String name) {
		stdId = id;
		stdName = name;
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Simple7 s7 = new Simple7(1, "JSM");
		System.out.println("1st student id is:" + s7.stdId);
		System.out.println("1st student name is:" + s7.stdName);
		System.out.println("-------------------------");
		Simple7 s77 = new Simple7(1, "SMP");
		System.out.println("1st student id is:" + s77.stdId);
		System.out.println("1st student name is:" + s77.stdName);
		System.out.println("Main Ends");
	}
}