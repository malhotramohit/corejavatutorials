package com.gs.ilp.corejava.abstractKeyword;

//An abstract class with constructor
abstract class BaseCLass {
	BaseCLass() {
		System.out.println("Base Constructor Called");
	}

	abstract void fun();
}

class DerivedClass extends BaseCLass {
	DerivedClass() {
		System.out.println("Derived Constructor Called");
	}

	void fun() {
		System.out.println("Derived fun() called");
	}
}

public class MainClass {
	public static void main(String args[]) {
		DerivedClass d = new DerivedClass();
	}
}
