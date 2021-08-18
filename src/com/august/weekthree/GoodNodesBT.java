package com.august.weekthree;

public class GoodNodesBT {

	public static void main(String[] args) {

		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(1);
		node.right = new TreeNode(4);
		node.left.left = new TreeNode(3);

		node.right.left = new TreeNode(1);
		node.right.right = new TreeNode(5);

		Solution sol = new Solution();
		System.out.println(sol.goodNodes(node));
	}
}

class Solution {
	int count = 0;

	public int goodNodes(TreeNode root) {
		int max = 0;
		recursiveCall(root, max);
		return count;
	}

	private void recursiveCall(TreeNode root, int max) {
		if (root == null) {
			return;
		}
		if (root.val >= max) {
			max = root.val;
			count++;
		}

		recursiveCall(root.left, max);
		recursiveCall(root.right, max);
	}

}
