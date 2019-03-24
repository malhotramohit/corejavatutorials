package com.gs.ilp.corejava.Arrays;

public class IterateMultiDimensionalJavaArray {
	public static void main(String args[]) {
		int sudoku[][] = { { 2, 1, 3 }, { 1, 3, 2 }, { 3, 2, 1 } };
		for (int row = 0; row < sudoku.length; row++) {
			for (int col = 0; col < sudoku[row].length; col++) {
				int value = sudoku[row][col];
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
