package com.gs.ilp.corejava.Constructor;

public class Test {
	Test() {
		this(10);
	}

	Test(int x) {
		System.out.println("x=" + x);
	}
}
