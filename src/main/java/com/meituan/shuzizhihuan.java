package com.meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 美团 2020春招 技术综合试卷在线考试
 * 编程题|20.0分1/5
 * 数字置换
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 首先给出你一个整数，可能为正也可能为负，这个数字中仅包含数字1-9，现在定义一个1-9的置换，即指定将整数中的某个数字按顺序变换为另一个数字，请你输出变换以后的数字是多少。
 *
 * 输入
 *  输入第一行包含一个整数a。(-10^1000<=a<=10^1000)
 *
 *  输入第二行包含9个以空格隔开的整数a_i , 第i个整数表示将数字i替换为数字a_i。(1<=a_i<=9)
 *
 * 输出
 * 请你输出数字变换之后的结果。
 *
 *
 * 样例输入
 * 1234567
 * 9 8 7 6 5 4 3 2 1
 * 样例输出
 * 9876543
 *
 * 提示
 * 输入样例2
 * -12
 * 2 3 7 6 5 4 3 2 1
 *
 * 输出样例2
 * -23
 *
 * 输入样例3
 * 73598793378342493
 * 1 3 6 1 6 8 9 1 3
 *
 * 输出样例3
 * 96631936691613136
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
 * @version 1.0.0 2020/3/26 7:35 PM
 * @since 1.0.0
 */
public class shuzizhihuan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num1 = in.next();

		int[] temp = new int[9];
		for (int i = 0; i < 9; i++) {
			temp[i] = in.nextInt();
		}

		Map<Integer, Integer> tempMap = new HashMap<>();
		for (int i = 0; i < 9; i++) {
			tempMap.put(i + 1, temp[i]);
		}
		System.out.println(getResult(num1, tempMap));
	}

	private static String getResult(String num, Map<Integer, Integer> maps) {
		StringBuilder sb = new StringBuilder();

		if (!num.substring(0, 1).equals("-")) {
			for (int i = 0; i < num.length(); i++) {
				sb.append(maps.get(Integer.parseInt(num.substring(i, i + 1))));
			}
			return sb.toString();
		} else {
			num = num.substring(1);
			System.out.println(num);
			for (int i = 0; i < num.length(); i++) {
				sb.append(maps.get(Integer.parseInt(num.substring(i, i + 1))));
			}
			return "-" + sb.toString();
		}
	}
}
