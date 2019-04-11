package com.gs.ilp.corejava.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestLamdaPreDef {
	public static void main(String[] args) {

		ArrayList<Flight> arrayList = new ArrayList<>(Arrays.asList(new Flight(3, "Luf"), new Flight(1, "name2")));

		Collections.sort(arrayList, new Comparator<Flight>() {

			@Override
			public int compare(Flight o1, Flight o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}

		});

		Collections.sort(arrayList, (a, b) -> {
			return b.getId() - a.getId();
		});

		System.out.println(arrayList);
	}
}
