package com.weizhong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 题目描述：
 * Cassidy和Eleanore是一对好朋友，她们经常会一起玩游戏。某一天她们玩了一个回文游戏。游戏规则是这样的：给出一个仅包含小写字母的字符串S，在每一个人的回合中，她们会进行两个操作：
 * <p>
 * 1. 尝试重新排列这个字符串，如果可以把这个字符串排列成回文字符串，则立即获胜。
 * <p>
 * 2. 否则，她们必须删掉字符串中的一个字符。
 * <p>
 * 已知，Cassidy先手，在两个人都采取最佳策略的情况下，谁可以获胜。
 * <p>
 * 输入
 * 输入第一行仅包含一个正整数t，表示数据组数，(t<=10)
 * <p>
 * 接下来有t行，每行有一个字符串S，表示一组测试数据。(|S|<=1000)
 * <p>
 * 输出
 * 对于每组数据输出一行，如果Cassidy获胜，则输出Cassidy，否则输出Eleanore
 * <p>
 * <p>
 * 样例输入
 * 2
 * aba
 * ab
 * 样例输出
 * Cassidy
 * Eleanore
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/04/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/4/8 7:35 PM
 * @since 1.0.0
 */
public class huiwen {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			String tmp = in.next();
			boolean flag = true;

			while (flag) {
				if (isPalindrome(tmp) || (tmp.length()>2&&subStr(tmp))) {
					System.out.println("Cassidy");
					flag = false;
				} else {
					tmp = tmp.substring(0, tmp.length() - 1);
					if (isPalindrome(tmp) || (tmp.length()>2&&subStr(tmp))) {
						System.out.println("Eleanore");
						flag = false;
					} else {
						tmp = tmp.substring(0, tmp.length() - 1);
					}
				}
			}
		}
	}

	public static boolean isPalindrome(String str) {
		char[] strArr = str.toCharArray();

		int top = 0;
		int end = str.length() - 1;

		if (str.equals("")) {
			return false;
		}
		while (top < end) {
			if (strArr[top++] != strArr[end--])
				return false;
		}
		return true;
	}

	public static boolean subStr(String str) {
		char[] strArr = str.toCharArray();
		Set<String> stringSet = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			stringSet.add(String.valueOf(strArr[i]));
		}
		if (str.length() % 2 == 0) {
			return stringSet.size() % 2 == 0;
		} else {
			return stringSet.size() % 2 != 0;
		}
	}
}
