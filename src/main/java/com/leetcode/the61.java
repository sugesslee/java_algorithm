package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/25     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/25 8:54 PM
 * @since 1.0.0
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
 * 示例 1:
 * 输入: [1,2,3,4,5]
 * 输出: True
 * 示例 2:
 * 输入: [0,0,1,2,5]
 * 输出: True
 * 输入: [0,0,2,2,5]
 * 输出: false
 */
public class the61 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] nums = new int[5];

		for (int i = 0; i < 5; i++) {
			nums[i] = in.nextInt();
		}

		System.out.println(isSequence(nums) ? "True" : "False");
	}

	private static boolean isSequence(int[] nums) {
		Arrays.sort(nums);
		int sum0 = 0;
		int flag = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0) {
				sum0 += 1;
			} else {
				if (nums[i + 1] == nums[i]) {
					return false;
				}
				if (nums[i + 1] != nums[i] + 1) {
					flag += (nums[i + 1] - nums[i] - 1);
				}
			}
		}
		return sum0 >= flag;
	}
}
