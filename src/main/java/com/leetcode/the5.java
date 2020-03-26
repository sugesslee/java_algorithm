package com.leetcode;

import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/26     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/26 8:17 AM
 * @since 1.0.0
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class the5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.next();

//		System.out.println(longestPalindrome(str));
		System.out.println(longestPalindrome1(str));
	}

	public static String longestPalindrome(String s) {
		int max = 0;
		String result = null;
		if (s.length() == 0) {
			return "";
		}
		if (s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {
				String temp = s.substring(i, j);
				if (isPalindrome(temp) && s.length() == max) {
					return s;
				}
				if (isPalindrome(temp) && max < temp.length()) {
					max = temp.length();
					result = temp;
				}
			}
		}
		return result;
	}

	public static boolean isPalindrome(String str) {
		int mid = str.length() / 2;

		for (int i = 0; i < mid; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static String longestPalindrome1(String s) {
		if (s.equals("")) {
			return s;
		}
		StringBuilder s1 = new StringBuilder(s).reverse();
		int length = s.length();
		int[][] arr = new int[length][length];

		int maxLen = 0;
		int maxEnd = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (s.charAt(i) == s1.charAt(j)) {
					if (i == 0 || j == 0) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j - 1] + 1;
					}
				}
				if (arr[i][j] > maxLen) {
					maxLen = arr[i][j];
					maxEnd = i;
				}
			}
		}
		return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
	}
}
