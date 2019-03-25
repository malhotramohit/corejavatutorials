package com.gs.ilp.corejava.thisKeyword;

public class ParentTest {
	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.i = 10;
		obj.method();
	}
}

class ABC extends ParentTest {
	int i;

	void method() {
		method1(this);
	}

	void method1(ABC t) {
		System.out.println(t.i);
	}
}
