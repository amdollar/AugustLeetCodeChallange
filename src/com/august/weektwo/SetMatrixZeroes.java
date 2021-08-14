package com.august.weektwo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		setZeroes(matrix);
		for (int[] temp : matrix) {
			for (int i : temp)
				System.out.print(i);
		}
		System.out.println("");
	}

	public static void setZeroes(int[][] matrix) {
		Set<Integer> rows = new HashSet<>();
		Set<Integer> columns = new HashSet<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					columns.add(j);
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (rows.contains(i) || columns.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}

	}

}
