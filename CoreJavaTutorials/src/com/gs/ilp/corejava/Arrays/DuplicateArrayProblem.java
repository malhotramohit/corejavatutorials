package com.gs.ilp.corejava.Arrays;

public class DuplicateArrayProblem {
	public static void main(String[] args) {
		int[] array1 = { 2, 4, -1, 5, 2, 9, 4, 2, 9, 0, 10, 11, 3, 4 };

		int[] array2 = { 2, 4, 5, 5, 5, 6, 7, 7, 7, 7, 8, 9, 10, 10, 13, 15 };

		// int[] res = removeDuplicateFromUnsortedArrayMethod1(array1);
		// displayArray(res);

		removeDuplicateFromSortedArrayMethod1(array2);
	}

	private static void displayArray(int[] res) {
		for (int k : res) {
			System.out.print(k + ",");
		}
	}

	private static int[] removeDuplicateFromUnsortedArrayMethod1(int[] array1) {
		int[] resArray = new int[1];
		resArray[0] = array1[0];
		int index = 1;
		for (int i : array1) {
			boolean isPresent = false;
			for (int j : resArray) {
				if (j == i) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent) {
				resArray = resizeArray(resArray);
				resArray[index++] = i;
			}
		}
		return resArray;
	}

	private static int[] resizeArray(int[] resArray) {
		int size = resArray.length;
		int[] newArray = new int[size + 1];
		int index = -1;
		for (int k : resArray) {
			index++;
			newArray[index] = resArray[index];
		}
		return newArray;
	}

	private static void removeDuplicateFromSortedArrayMethod1(int[] array1) {
		int index = 0;
		int numOfShiftOp = 0;
		for (int j = 0; j < array1.length; j++) {
			++index;
			if (index < array1.length && array1[j] == array1[index] && numOfShiftOp<array1.length-1) {
				// left shift operation
				++numOfShiftOp;
				leftShift(array1, j);
				--j;
				--index;
			}
		}
		displayArray(array1);
	}

	private static void leftShift(int[] array1, int index) {
		for (int i = index; i + 1 < array1.length; i++) {
			array1[i] = array1[i + 1];
		}
	}

}
