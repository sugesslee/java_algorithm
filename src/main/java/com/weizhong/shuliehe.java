package com.weizhong;

import java.util.Scanner;

/**
 * 题目描述：
 * 数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
 * 输入
 * 输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
 * <p>
 * 输出
 * 对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
 * <p>
 * <p>
 * 样例输入
 * 81 4
 * 2 2
 * <p>
 * 样例输出
 * 94.73
 * 3.41
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/04/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/4/8 3:25 PM
 * @since 1.0.0
 */
public class shuliehe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double m = in.nextInt();
			int n = in.nextInt();

			double sum = 0;
			for (int i = 0; i < n; i++) {
				sum += m;
				m = Math.sqrt(m);
			}
			System.out.printf("%.2f", sum);
		}
	}

}
