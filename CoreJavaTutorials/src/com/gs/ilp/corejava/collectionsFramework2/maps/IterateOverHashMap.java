package com.gs.ilp.corejava.collectionsFramework2.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
	public static void main(String[] args) {
		Map<String, Double> employeeSalary = new HashMap<>();

		employeeSalary.put("David", 76000.00);
		employeeSalary.put("John", 120000.00);
		employeeSalary.put("Mark", 95000.00);
		employeeSalary.put("Steven", 134000.00);

		Set<Map.Entry<String, Double>> emplSalaySet = employeeSalary.entrySet();

		for (Map.Entry<String, Double> mapVal : employeeSalary.entrySet()) {

			System.out.println("Key is " + mapVal.getKey());
			System.out.println("Value is " + mapVal.getValue());

		}

		// for each loop
		List<String> list = new ArrayList<>();
		list.add("David");
		list.add("Steve");
		list.add("Mark");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("For each loop");
		// Class name refer : collection
		for (String obj : list) {
			System.out.println(obj);
		}

		List<Double> listOfSalary = new ArrayList<>();
		listOfSalary.add(233333.00);
		listOfSalary.add(233334.00);
		listOfSalary.add(233335.00);

		for (Double salary : listOfSalary) {
			System.out.println(salary);
		}

	}
}