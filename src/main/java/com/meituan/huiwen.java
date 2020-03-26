package com.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/24     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/24 8:56 AM
 * @since 1.0.0
 */
public class huiwen {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		// 得到子串
		List<String> subStrList = getSubStr(str);
		// 判断子串是否为回文串
		System.out.print(countSubStr(subStrList));
	}

	private static List<String> getSubStr(String str) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				result.add(str.substring(i, j));
			}
		}
		return result;
	}

	private static int countSubStr(List<String> input) {
		int sum = 0;
		for (String element : input) {
			if (element.length() == 1) {
				sum += 1;
			} else {
				int mid = element.length() / 2;
				for (int i = 0; i < mid; i++) {
					if (element.charAt(i) != element.charAt(element.length() - i - 1)) {
						break;
					} else {
						if (i == mid - 1) {
							sum += 1;
						}
					}
				}
			}
		}
		return sum;
	}
}
