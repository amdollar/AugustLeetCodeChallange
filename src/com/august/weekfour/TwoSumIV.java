package com.august.weekfour;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.august.weekthree.TreeNode;

public class TwoSumIV {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(1);
		node.right = new TreeNode(3);
		/*
		 * node.left.left = new TreeNode(2); node.left.right = new TreeNode(4);
		 * 
		 * // node.right.left = new TreeNode(1); node.right.right = new TreeNode(7);
		 */
		System.out.println(findTarget(node, 1));
	}

	private static void printPreOrder(TreeNode node, List<Integer> data) {
		if (node == null)
			return;
		printPreOrder(node.left, data);
		data.add(node.val);
		printPreOrder(node.right, data);

	}

	public static boolean findTarget(TreeNode root, int k) {
		boolean result = false;
		List<Integer> data = new ArrayList<>();
		printPreOrder(root, data);

		// logic to find the target sum in the list.
		int left = 0;
		int right = data.size() - 1;

		while (left < right) {
			if (data.get(left) + data.get(right) < k) {
				left++;
			} else if (data.get(left) + data.get(right) > k) {
				right--;
			} else if (data.get(left) + data.get(right) == k) {
				return true;
			}
		}

		return result;
	}

}
