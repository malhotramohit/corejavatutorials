package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestEmp {
	public static void main(String[] args) {
		Employeeee employeeee = new Employeeee("Mohit", "Malhotra");
		Employeeee employeeee1 = new Employeeee("Mohit", "Malhotra");
		Map<Employeeee, Employeeee> map = new HashMap<Employeeee, Employeeee>();

		map.put(employeeee, employeeee);
		map.put(employeeee1, employeeee1);

		for (Map.Entry<Employeeee, Employeeee> m : map.entrySet()) {
			System.out.println(m.getKey());
		}

		Set<Employeeee> setOfEmp = new HashSet<>();
		setOfEmp.add(employeeee);
		setOfEmp.add(employeeee1);
		
		System.out.println(setOfEmp);
		
	}

}
