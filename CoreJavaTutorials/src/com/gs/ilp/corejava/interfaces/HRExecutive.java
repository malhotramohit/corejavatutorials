package com.gs.ilp.corejava.interfaces;

public class HRExecutive  extends Employeeee implements Interviewer{

	String[] specialization;
	
	public void conductInterview() {
		System.out.println("HR is conducting interview");
	}

}
