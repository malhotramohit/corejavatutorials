package com.gs.ilp.corejava.objectAndClass.basics;

public class Empoloyeee {
	int eid;
	String eName;

	void setValue(int a, String b) {
		eid = a;
		eName = b;
	}

	void show() {
		System.out.println("eid=" + eid);
		System.out.println("eName=" + eName);
	}

	public static void main(String[] args) {
		Empoloyeee obj1 = new Empoloyeee();
		Empoloyeee obj2 = new Empoloyeee();
		obj1.setValue(747, "Mohit");
		obj2.setValue(856, "Rohit");
		obj1.show();
		obj2.show();
	}
}
