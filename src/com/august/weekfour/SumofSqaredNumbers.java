package com.august.weekfour;

public class SumofSqaredNumbers {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(judgeSquareSum(num));

	}

	public static boolean judgeSquareSum(int c) {
		boolean res = false;
		// need to check for all the possibilities starting from 0 to squre root of c;

		for (int i = 0; i * i <= c; i++) {
			for (int j = 0; j * j <= c; j++) {
				if (((i * i) + (j * j)) == c) {
					return true;
				}
			}
		}
		return res;
	}

}
