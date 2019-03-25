package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class TestDoctorHashcodeRule3 {
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor("Mohit", "Vijay");
		Doctor doctor2 = new Doctor("Vijay", "Mohit");
		System.out.println(
				"Doctors having different objects with different values but they still can have same hashcode");
		System.out.println("Are they equal " + doctor1.equals(doctor2));
		System.out.print("Do the have same hashcode ");
		if (doctor1.hashCode() == doctor2.hashCode()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		System.out.println("Hashcode of doctor 1 " + doctor1.hashCode());
		System.out.println("Hashcode of doctor 2 " + doctor2.hashCode());
	}

}
