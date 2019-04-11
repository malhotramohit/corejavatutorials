package com.gs.ilp.corejava.interfaces;

public class TestInterfaces {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.attendTraining();
		manager.conductInterview();

		Programmer programmer = new Programmer();
		programmer.attendTraining();
	}
}
