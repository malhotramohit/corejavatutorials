package com.gs.ilp.corejava.abstractKeyword;

abstract class BaseClass1 {
	void fun() {
		System.out.println("Base fun() called");
	}
}

class DerivedClass1 extends BaseClass1 {
}

public class MainClass1 {
	public static void main(String args[]) {
		DerivedClass1 d = new DerivedClass1();
		d.fun();
	}
}