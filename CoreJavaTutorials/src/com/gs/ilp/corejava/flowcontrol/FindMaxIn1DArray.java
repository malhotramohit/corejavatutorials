package com.gs.ilp.corejava.flowcontrol;

import java.util.Scanner;

public class FindMaxIn1DArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter the value at index " + i);
			arr[i] = sc.nextInt();
		}

		int max = arr[0]; // assume max as the first element

		// start comparing from the next element if any other element from array is
		// greater than max than thats the max.
		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max is " + max);
		sc.close();

	}
}
