package com.gs.ilp.corejava.flowcontrol;

import java.util.Scanner;

/*
 * Test Case 1
Enter the size
5
enter the value at index 0
23
enter the value at index 1
45
enter the value at index 2
32
enter the value at index 3
67
enter the value at index 4
12
Max is 67
*/

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
