package com.gs.ilp.corejava.interfaces;

public class Programmer extends Employeeee implements Trainable {
	String[] programmingLanguages;
	void writeCode() {
	}
	public void attendTraining() {
		System.out.println("Prog - attendTraining");
	}
}
