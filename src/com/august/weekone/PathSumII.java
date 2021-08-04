package com.august.weekone;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		int targetSum = 3;
		List<List<Integer>> res = pathSum(root, targetSum);
System.out.println(res);
	}

	public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> result = new ArrayList<>();

		findPathSum(new ArrayList<>(), root, targetSum, result);

		return result;
	}

	public static void findPathSum(List<Integer> current, TreeNode root, int targetSum, List<List<Integer>> result) {
		if (root == null) {
			return;
		}

		current.add(root.val);
		if (root.val == targetSum && root.left == null && root.right == null) {
			result.add(current);
			return;
		}

		findPathSum(new ArrayList<>(current), root.left, targetSum - root.val, result);
		findPathSum(new ArrayList<>(current), root.right, targetSum - root.val, result);

	}

}
