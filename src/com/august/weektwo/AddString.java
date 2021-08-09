package com.august.weektwo;

public class AddString {

	public static void main(String[] args) {
		String num1 = "456";
		String num2 = "77";
		String res = addStrings(num1, num2);
		System.out.println(res);

	}

	public static String addStrings(String num1, String num2) {
		if (num1 == null || num1.equals("") || num2 == null || num2.equals("")) {
			return "";
		}
		StringBuilder res = new StringBuilder();
		int l1 = num1.length() - 1;
		int l2 = num2.length() - 1;
		int carry = 0;
		while (l1 >= 0 || l2 >= 0) {
			int sum = carry;
			if (l1 >= 0) {
				sum += Character.getNumericValue(num1.charAt(l1--));
			}
			if (l2 >= 0) {
				sum += Character.getNumericValue(num2.charAt(l2--));
			}

			res.append(sum % 10);
			carry = sum / 10;
		}
		if (carry != 0) {
			res.append(carry);
		}

		return String.valueOf(res.reverse());
	}
}
