package com.gs.ilp.corejava.methodoverriding;

class Human extends Object {

	public  void m1() {
		final int i =3;
		System.out.println(" parent m1");
	}

	public void m2() {
		System.out.println(" parent m1");
	}

}

public class Boy extends Human {
	public void m1() {
		System.out.println(" child m1");
	}

	public void m3() {
		System.out.println(" child m3");
	}

	public static void main(String args[]) {
		Human human = new Boy();
		human.m1();
		human.m2();
		//shuman.m3();
		

	}
}