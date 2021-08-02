package com.august.weekone;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 4 };
		int[] res = twoSum(arr, 6);
		for (int u : res)
			System.out.println(u);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		Map<Integer, Integer> data = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if (data.containsKey(target - nums[i])) {
				ans[0] = i;
				ans[1] = data.get(target - nums[i]);
				return ans;
			} else {
				data.put(nums[i], i);
			}

		}
		return ans;
	}

}
