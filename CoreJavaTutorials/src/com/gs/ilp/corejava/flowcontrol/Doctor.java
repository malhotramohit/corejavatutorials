package com.gs.ilp.corejava.flowcontrol;

public class Doctor {

	static {

		System.out.println("i am static block 1");
	}

	public  Doctor() {
		System.out.println("I am cons");

	}

	static {

		System.out.println("i am static block 2");
	}

	private int age;

	// static field
	private static String doctorName;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

}
