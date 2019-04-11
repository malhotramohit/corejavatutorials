package com.gs.ilp.corejava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("same", "mohit", "akash");

		List<String> list = names.stream().filter(name -> {
			return !name.equals("mohit");
		}).collect(Collectors.toList());

		list.stream().forEach(System.out::println);

		 names.stream()
		 .filter(TestStream::checkName)
		 .forEach(name-> System.out.println(name));
		 
		 

	}

	private static boolean checkName(String name) {
		return !name.equals("mohit");
	}

}
