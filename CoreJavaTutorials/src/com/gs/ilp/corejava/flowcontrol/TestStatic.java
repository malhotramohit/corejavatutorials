package com.gs.ilp.corejava.flowcontrol;

public class TestStatic {
	public static void main(String[] args) {
		//
		
		// static method
		// static field
		
		
		//MyUtility util = new MyUtility();
		
		int a  = MyUtility.getMaxOfTwoNums(34,87);
		
		System.out.println(a);
		
		Doctor mohit = new Doctor();
		mohit.setAge(25);
		mohit.setDoctorName("name1");
		
		Doctor rohiy = new Doctor();
		rohiy.setAge(27);
		rohiy.setDoctorName("name2");

		
		
		System.out.println(mohit.getDoctorName());
		System.out.println(rohiy.getDoctorName());
		System.out.println(Doctor.getDoctorName());
		
		
		System.out.println(MyConstants.COMPANY_NAME);
		//MyConstants.COMPANY_NAME = "anc";
		System.out.println(MyConstants.COMPANY_NAME);

		
		int age = MyUtility.getMaxOfTwoNums(mohit.getAge(),rohiy.getAge());
		System.out.println(age);
		
		
		
		//JVM :: TestStatic.main
		
	}
}
