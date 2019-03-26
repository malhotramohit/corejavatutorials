package com.gs.ilp.corejava.finalKeyword;

public class E {
	public void test(final int i) {
		i = 30;// The final local variable i cannot be assigned. It must be blank and not using
				// a compound assignment
		System.out.println(i);
	}

	public static void main(String[] args) {
		E e1 = new E();
		e1.test(10);
	}
}
