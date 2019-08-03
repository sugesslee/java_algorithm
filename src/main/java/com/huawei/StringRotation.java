package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/08/03     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019-08-03 08:35
 * @since 1.0.0
 * input
 * AABCD
 * CDAA
 * AABCD
 * ABCD
 * AABCD
 * BDD
 */
public class StringRotation {
	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			Scanner in = new Scanner(System.in);
			input.add(in.nextLine());
		}
		List<String> result = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				result = get_str(input.get(i));
			} else {
				int bol = is_have(input.get(i), result);
				System.out.print(bol);
			}
		}
	}

	private static List<String> get_str(String str) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			result.add(str.substring(i) + str.substring(0, i));
		}
		return result;
	}

	private static int is_have(String source, List<String> target) {
		for (String str : target) {
			int len = str.length() - source.length();
			for (int i = 0; i < len + 1; i++) {
				if (source.equals(str.substring(i, source.length() + i))) {
					return 1;
				}
			}
		}
		// 不包含返回0
		return 0;
	}
}
