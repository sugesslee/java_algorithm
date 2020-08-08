package com.weizhong;

import java.util.Scanner;

/**
 * 题目描述：
 * 有n位小朋友去小明家里拜年，小明准备了m份礼物。小明想把所有礼物平均分给每个小朋友，每个小朋友得到相同个数的礼物。但是m未必能被n整除，小明可以使用以下两种操作任意多次（两种操作可以同时使用）。
 * <p>
 * 1、 给其中一个小朋友发红包，收到红包的小朋友会离开小明家。每个红包需要花费a元。
 * <p>
 * 2、 购买一个新礼物，每个礼物价值为b元。
 * <p>
 * 问小明最少花费多少元，才能使得所有礼物可以被剩下的小朋友平分。
 * <p>
 * 输入
 * 第一行输入四个整数n,m,a,b（1≤n,m,a,b≤100）。
 * <p>
 * 输出
 * 输出最少花费。
 * <p>
 * <p>
 * 样例输入
 * 7 5 10 100
 * 样例输出
 * 20
 * <p>
 * 提示
 * 输入样例2
 * 2 2 10 10
 * 输出样例2
 * 0
 * 输入样例3
 * 3 1 10 10
 * 输出样例3
 * 20
 * 样例解释
 * 样例一发两个红包。样例二不需要任何操作。样例三买两个新礼物，或者发两个红包，或者发一个红包买一个新礼物。
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/04/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/4/8 7:41 PM
 * @since 1.0.0
 */
public class fenliwu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();

		if (n <= m) {
			System.out.println(0);
		} else {
			if (n - m == 1) {
				System.out.println(Math.min(a, b));
			} else {
				int sum = 0;
				for (int i = 0; i < n - m; i++) {
					sum += Math.min(a, b);
				}
				System.out.println(sum);
			}
		}
	}
}
