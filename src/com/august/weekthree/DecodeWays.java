package com.august.weekthree;

public class DecodeWays {

	public static void main(String[] args) {
		String num = new String("226");

		System.out.println(numDecodings(num));
	}

	public static int numDecodings(String s) {
		int[] arr = new int[s.length() + 1];

		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i <= s.length(); i++) {
			int firstDigit = Integer.valueOf(s.substring(i - 1, i));
			int twoDigit = Integer.valueOf(s.substring(i - 2, i));

			if (firstDigit >= 1) {
				arr[i] += arr[i - 1];
			}
			if (twoDigit >= 10 && twoDigit <= 26) {
				arr[i] += arr[i - 2];
			}
		}
		return arr[s.length()];
	}

}
