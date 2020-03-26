package com.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 子序列计数
 * 时间限制：C/C++语言 3000MS；其他语言 5000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 一个序列是有趣的需要满足：当且仅当这个序列的每一个元素ai 满足 i 整除ai 。
 * <p>
 * 现在给定一个长度为n的数组，问这个数组有多少个非空的子序列是有趣的，由于答案可能比较大，只需要输出在模998244353意义下答案的就行了。
 * <p>
 * 一个长度为n的数组的非空子序列定义为从这个数组中移除至多n-1个元素后剩下的元素有序按照原顺序形成的数组。比如说对于数组[3,2,1]，它的非空子序列有[3],[2],[1],[3,2],[3,1],[2,1],[3,2,1]。
 * <p>
 * 输入
 * 第一行一个整数n表示序列的长度。(1<=n<=1e5)
 * <p>
 * 第二行n个整数表示给定的序列。(1<=ai<=1e6)
 * <p>
 * 输出
 * 输出一个数表示有趣的子序列的个数。
 * <p>
 * <p>
 * 样例输入
 * 2
 * 3 1
 * 样例输出
 * 2
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/26     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/26 8:17 PM
 * @since 1.0.0
 */
public class zixuliejishu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] num = new String[n];

		for (int i = 0; i < n; i++) {
			num[i] = in.next();
		}

	}

	private static void getResult(int n, String[] arr) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				System.out.println(arr[i+j]);
			}
		}
	}

}
