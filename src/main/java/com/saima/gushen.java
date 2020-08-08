package com.saima;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 有股神吗？
 * <p>
 * 有，小赛就是！
 * <p>
 * 经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 * <p>
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/04/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/4/8 10:07 AM
 * @since 1.0.0
 */
public class gushen {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		List<Integer> days = new ArrayList<>();
		while (in.hasNextInt()) {
//			days.add(in.nextInt());
			int days = in.nextInt();
			// 涨的天数
			int addDay = 1;
			// 已涨天数
			int addDayed = 0;
			// 目前股价
			int sum = 1;
			for (int j = 1; j < days; j++) {
				if (addDayed < addDay) {
					sum += 1;
					addDayed += 1;
				} else {
					sum -= 1;
					addDay += 1;
					addDayed = 0;
				}
			}
			System.out.println(sum);
		}

//		for (Integer day : days) {
//			// 涨的天数
//			int addDay = 1;
//			// 已涨天数
//			int addDayed = 0;
//			// 目前股价
//			int sum = 1;
//			for (int j = 1; j < day; j++) {
//				if (addDayed < addDay) {
//					sum += 1;
//					addDayed += 1;
//				} else {
//					sum -= 1;
//					addDay += 1;
//					addDayed = 0;
//				}
//			}
//			System.out.println(sum);
//		}
	}
}
