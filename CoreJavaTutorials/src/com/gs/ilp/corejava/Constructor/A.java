package com.gs.ilp.corejava.Constructor;

public class A {
	A() {
		System.out.println("From A()");
	}

	A(int a) {
		System.out.println("From A(int a)");
	}

	A(double d) {
		System.out.println("From A(double d)");
	}

	A(int i, double d) {
		System.out.println("From A(inti,double d)");
	}

	public static void main(String[] args) {
		A a1 = new A();
		A a11 = new A(50);
		A a111 = new A(50.1);
		A a1111 = new A(50, 50.8);
		A a11111 = new A(50, 60.9);
	}
}
