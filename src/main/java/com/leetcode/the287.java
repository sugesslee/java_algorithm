package com.leetcode;

/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * 说明：
 * <p>
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 *
 * 快慢指针，闭环
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/6 3:32 PM
 * @since 1.0.0
 */
public class the287 {
	public static void main(String[] args) {
		Solution287 solution287 = new Solution287();
		int result = solution287.findDuplicate(new int[]{3,1,3,4,2});
		System.out.println(result);
	}
}

class Solution287 {
	public int findDuplicate(int[] nums) {

		int fast = 0;
		int slow = 0;
		while (true) {
			fast = nums[nums[fast]];
			slow = nums[slow];

			if (fast == slow) {
				fast = 0;
				while (nums[fast] != nums[slow]) {
					fast = nums[fast];
					slow = nums[slow];
				}
				return nums[slow];
			}
		}
	}
}
