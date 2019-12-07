package com.leetcode;

import java.util.Arrays;

/**
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 1.先计算输入数组的左积，放在结果数组
 * 2.将左积的倒数第二个结果放在倒数第一个作为结果
 * 3.倒序循环数组中倒数第二个至第二个，用变量依次记录右积，用左积数组的(i-1)*右积作为当前结果放入result
 * 4.将右积(临时变量存储)的结果放在左积数组的第0位作为结果
 * 5.返回结果集
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/6 10:05 AM
 * @since 1.0.0
 */
public class the238 {
	public static void main(String[] args) {
		Solution238 solution = new Solution238();
		int[] result = solution.productExceptSelf(new int[]{1, 2, 3, 4});
		System.out.println(Arrays.toString(result));
	}
}

class Solution238 {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result[i] = nums[i] * result[i - 1];
		}
//		System.out.println(Arrays.toString(result));
		result[nums.length - 1] = result[nums.length - 2];
		int temp = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 1; i--) {
//			System.out.println(temp);
			result[i] = result[i - 1] * temp;
			temp *= nums[i];
		}
		result[0] = temp;

		return result;
	}
}
