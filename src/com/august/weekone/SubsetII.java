package com.august.weekone;

import java.util.ArrayList;
import java.util.List;

public class SubsetII {
//[1.2.3]
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		List<List<Integer>> res = findSubSet(arr);
		for (List<Integer> temp : res) {
			for (int i : temp) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	private static List<List<Integer>> findSubSet(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());

		for (int i : arr) {
			int resLen = result.size();
			for (int j = 0; j < resLen; ++j) {
				List<Integer> temp = new ArrayList(result.get(j));
				temp.add(i);
				result.add(temp);
			}
		}

		return result;
	}

}
