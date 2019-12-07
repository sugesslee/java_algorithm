package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 * <p>
 * 找到所有出现两次的元素。
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [2,3]
 * 思路：对相同数对应的数组位置做标记(*-1 < 0)
 *
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/6 10:45 AM
 * @since 1.0.0
 */
public class the442 {
	public static void main(String[] args) {
		Solution442 solution442 = new Solution442();
		List<Integer> result = solution442.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
		System.out.println(result.toString());
	}
}

class Solution442 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int num = Math.abs(nums[i]);
			if (nums[num - 1] > 0) {
				nums[num - 1] *= -1;
			} else {
				result.add(num);
			}
		}
		return result;
	}
}
