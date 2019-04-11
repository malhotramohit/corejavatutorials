package com.gs.ilp.corejava.interfaces;

public class Manager extends Employeeee implements Interviewer, Trainable {
	int teamSize;
	void reportProjectStatus() {
	}
	public void attendTraining() {
		System.out.println("Mgr - attendTraining");
	}
	public void conductInterview() {
		System.out.println("Mgr - conductInterview");
	}
}
