package com.meituan;

import java.util.Scanner;

/**
 * 同心圆
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 有这么一个奇怪的符号：在一张正方形的纸上，有许多不同半径的圆。他们的圆心都在正方形的重心上（正方形的重心位于正方形两条对角线的交叉点上）。
 *
 * 最大的圆的外面部分是白色的。最外层的圆环被涂成了黑色，接下来第二大的圆环被涂层白色，接下来第三大的圆环被涂层黑色。以此类推，例如下图。
 *
 * 现在，给你这些圆的半径，请问黑色部分的面积是多少？精确到小数点后5位输出（四舍五入）。
 *
 *
 *
 * 输入
 * 输入包含两行。第一行一个整数n，表示圆的个数。
 *
 * 接下来n个整数，描述每个圆的半径ri。数据保证没有两个圆的半径是一样的。(1<=n<=100 , ri<=1000)
 *
 * 输出
 * 输出包含一个数，代表黑色部分的面积。
 *
 *
 * 样例输入
 * 5
 * 1 2 3 4 5
 * 样例输出
 * 47.12389
 *
 * 提示
 * 样例解释：
 * 一共有5个圆(环)，其中最大的，第三大的，以及最小的圆环被染成了黑色。注意，最小的圆环已经退化为一个圆了。
 * 规则
 * 请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果
 * 点击“调试”亦可保存代码
 * 编程题可以使用本地编译器，此页面不记录跳出次数
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/26     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/26 7:14 PM
 * @since 1.0.0
 */
public class tongxinyuan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}

		System.out.printf("%.5f", getArea(nums, n));
	}

	private static double getArea(int[] nums, int n) {
		int sum = 0;
		if (n % 2 == 0) {
			for (int i = 0; i < n - 1; i++) {
				if ((i + 1) % 2 != 0) {
					sum += Math.pow(nums[i], 2);
				} else {
					sum -= Math.pow(nums[i], 2);

				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if ((i + 1) % 2 != 0) {
					sum += Math.pow(nums[i], 2);
				} else {
					sum -= Math.pow(nums[i], 2);

				}
			}
		}
		return Math.PI * sum;
	}
}
