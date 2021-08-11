package com.august.weektwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given an integer array of even length arr, return true if it is possible to reorder arr such that arr[2 * i + 1] = 2 * arr[2 * i] for every 0 <= i < len(arr) / 2, or false otherwise.*/
public class DoubledPairs {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 4, 16, 8, 4 };
		System.out.println(canReorderDoubled(arr));
	}

	public static boolean canReorderDoubled(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		if (map.getOrDefault(0, 0) % 2 != 0)
			return false; // odd number of zeroes
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
		for (int i : list) {
			if (i == 0)
				continue;
			int v = map.get(i), d = map.getOrDefault(2 * i, 0);
			if (d < v)
				return false; // not enough doubles to map with
			map.put(2 * i, d - v);
		}
		return true;
	}

}
