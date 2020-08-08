package com.weizhong;

import java.util.Scanner;

/**
 * 题目描述：
 * 春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的： “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。 现在要求输出所有在m和n范围内的水仙花数。
 * <p>
 * 输入
 * 输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
 * <p>
 * 输出
 * 对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开; 如果给定的范围内不存在水仙花数，则输出no; 每个测试实例的输出占一行。
 * <p>
 * <p>
 * 样例输入
 * 100 120
 * 300 380
 * <p>
 * 样例输出
 * no
 * 370 371
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/04/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/4/8 3:26 PM
 * @since 1.0.0
 */
public class shuixianhuashu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int m = in.nextInt();
			int n = in.nextInt();
			boolean flag = false;
			for (int i = m; i <= n; i++) {
				char[] tmp = String.valueOf(i).toCharArray();
				if ((int) (Math.pow(Double.parseDouble(String.valueOf(tmp[0])), 3) + Math
						.pow(Double.parseDouble(String.valueOf(tmp[1])), 3) + Math
						.pow(Double.parseDouble(String.valueOf(tmp[2])), 3)) == i) {
					System.out.print(i + " ");
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("no");
			} else {
				System.out.println();
			}
		}
	}
}
