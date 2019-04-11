package com.gs.ilp.corejava.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gs.ilp.corejava.java8.lambda.Flight;

public class TestMapper {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("same", "mohit", "akash");

		// List<Flight> flights =
		// names.stream().filter(TestMapper::checkName).map(Flight::new)
		// .collect(Collectors.toList());
		//
		// System.out.println(flights);

		List<Flight> flights = null;
		flights = new ArrayList<>(names.size());
		for (String st : names) {
			Flight f = new Flight(st);
			flights.add(f);
		}

		System.out.println(flights);

	}

	private static boolean checkName(String name) {
		return !name.equals("mohit");
	}

}
