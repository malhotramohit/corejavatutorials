package com.gs.ilp.corejava.staticKeyword;

//Program of changing the common property of all objects.
public class Student {
	int rol;
	String name;
	static String colg = "ITS";

	static void change() {
		colg = "BBDIT";
	}

	Student(int r, String n) {
		rol = r;
		name = n;
	}

	void display() {
		System.out.println(rol + " " + name + " " + colg);
	}

	public static void main(String args[]) {
		Student.change();
		Student s1 = new Student(11, "Ram");
		Student s2 = new Student(22, "Raj");
		Student s3 = new Student(33, "Sam");
		s1.display();
		s2.display();
		s3.display();
	}
}