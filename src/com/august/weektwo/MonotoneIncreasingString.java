package com.august.weektwo;

public class MonotoneIncreasingString {

	public static void main(String[] args) {
		String s = new String("00110");
		int res = minFlipsMonoIncr(s);
		System.out.println(res);
	}

	public static int minFlipsMonoIncr(String s) {
		int flip = 0;

		int one = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == '1') {
				one++;
			} else {
				flip++;
			}
			flip = Math.min(flip, one);
		}

		return flip;
	}

}
