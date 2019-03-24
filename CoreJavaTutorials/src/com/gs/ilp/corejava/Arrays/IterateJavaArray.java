package com.gs.ilp.corejava.Arrays;

public class IterateJavaArray {
	public static void main(String args[]) {
		String studentsName[] = { "Monty", "John", "Smith", "Clark", "Susen" };
		// java array iteration using enhanced for loop
		for (String studentName : studentsName) {
			System.out.println(studentName);
		}
	}
}