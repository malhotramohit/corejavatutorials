package com.gs.ilp.corejava.Constructor;

public class Student {
	String stdName;
	int stdId;
	int age;

	Student(String name, int id, int a) {
		stdName = name;
		stdId = id;
		age = a;
	}

	Student(String name, int id) {
		stdName = name;
		stdId = id;
	}

	public static void main(String[] args) {
		Student s1 = new Student("JSM", 10, 90);
		System.out.println("1st student id is:" + s1.stdId);
		System.out.println("1st student Name is:" + s1.stdName);
		System.out.println("1st student age is:" + s1.age);
		Student s2 = new Student("SMP", 20);
		System.out.println("1st student id is:" + s2.stdId);
		System.out.println("1st student Name is:" + s2.stdName);
	}
}