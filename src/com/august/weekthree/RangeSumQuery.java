package com.august.weekthree;

public class RangeSumQuery {

	public static void main(String[] args) {
		int nums[] = new int[] { -2, 0, 3, -5, 2, -1 };
		NumArray arr = new NumArray(nums);
		int res = arr.sumRange(0, 0);
		System.out.println(res);
	}

}

class NumArray {

	int[] nums = null;

	public NumArray(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int left, int right) {
		int sum = 0;
		while (left <= right) {
			sum += nums[left];
			left++;
		}
		return sum;
	}
}
