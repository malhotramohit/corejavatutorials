package com.gs.ilp.corejava.staticKeyword;

//Program of static variable  
public class Student8 {
	int rol;
	String name;
	static String colg = "ITS";

	Student8(int r, String n) {
		rol = r;
		name = n;
	}

	void display() {
		System.out.println(rol + " " + name + " " + colg);
	}

	public static void main(String args[]) {
		Student8 s1 = new Student8(11, "Ram");
		s1.display();
	}
}
