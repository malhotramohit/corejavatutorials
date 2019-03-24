package com.gs.ilp.corejava.objectAndClass.basics;

public class Emp {
	int eid = 1020;
	String eName = "Mohit";

	void show() {
		System.out.println("eid=" + eid);
		System.out.println("eName=" + eName);
	}

	public static void main(String[] args) {
		Emp obj = new Emp();
		Emp obj2 = new Emp();
		obj.show();
		obj2.show();
	}
}
