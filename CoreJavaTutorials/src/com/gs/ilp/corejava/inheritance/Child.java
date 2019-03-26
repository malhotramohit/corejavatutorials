package com.gs.ilp.corejava.inheritance;

class Parent {
	public void show() {
		System.out.println("Parent method");
	}
}

public class Child extends Parent {
	public void display() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		Child cobj = new Child();
		cobj.display(); // method of Child class
		cobj.show(); // method of Parent class
	}
}