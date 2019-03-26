package com.gs.ilp.corejava.abstractKeyword;

abstract class BaseB {
	final void fun() {
		System.out.println("Derived fun() called");
	}
}

class DerivedD extends BaseB {
}

public class MainM {
	public static void main(String args[]) {
		BaseB b = new DerivedD();
		b.fun();
	}
}