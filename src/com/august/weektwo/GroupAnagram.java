package com.august.weektwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> ans = groupAnagrams(strs);
		System.out.println(ans);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> data = new HashMap<>();
		if (strs.length == 0)
			return res;

		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String key = String.valueOf(chars);
			if (!data.containsKey(key)) {
				data.put(key, new ArrayList<>());
			}
			data.get(key).add(str);

		}
		return new ArrayList<>(data.values());

	}
}
