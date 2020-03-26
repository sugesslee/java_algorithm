package com.meituan;

import java.util.Scanner;

/**
 * 套娃前缀和
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 套娃最近很流行，小美想知道前缀和是否也可以进行套娃操作。
 * <p>
 * <p>
 * <p>
 * 小美现在想知道能否快速求解
 * <p>
 * <p>
 * <p>
 * 输入
 * 第一行两个数N，K。
 * <p>
 * 第二行N个数，第 i 个数为a[i]。
 * <p>
 * 1<=N<=5000 ；1<=K<998244353；0<=a[i]<998244353
 * <p>
 * <p>
 * <p>
 * 输出
 * 一个数表示sum[K][N]。
 * <p>
 * <p>
 * 样例输入
 * 4 3
 * 1 0 0 0
 * 样例输出
 * 10
 * <p>
 * 提示
 * 样例解释，需要三次求和：
 * 第一次：sum[1][1] = sum[0][1] = 1, sum[1][2] = sum[0][1] + sum[0][2] = 1, sum[1][3] = sum[0][1] + sum[0][2] + sum[0][3] = 1, sum[1][4] = sum[0][1] + sum[0][2] + sum[0][3] + sum[0][4] = 1. sum[1][] = { 1, 1, 1, 1 };
 * 第二次：sum[2][] = { 1, 2, 3, 4 }.
 * 第三次：sum[3][] = { 1, 3, 6, 10 }.
 * 故sum[K][N] = sum[3][4] = 10
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/26     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/26 8:39 PM
 * @since 1.0.0
 */
public class qianzhuihe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int K = in.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		int[][] arrs = new int[N + 1][N + 1];

		arrs[0][0] = 0;
		for (int i = 1; i < N + 1; i++) {
			arrs[0][i] = arr[i - 1];
			arrs[i][0] = 0;
		}

		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				arrs[i][j] = arrs[i - 1][j] + arrs[i][j - 1];
				if (K == i && N == j) {
					System.out.println(arrs[K][N]);
				}
			}
		}
	}
}
