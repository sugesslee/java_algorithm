package com.lanqiaobei.the11;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * ninth
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/01/20     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/1/20 4:32 PM
 * @since 1.0.0
 */
@Slf4j
public class ninth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger K = in.nextBigInteger();

		BigInteger[] list = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			list[i] = in.nextBigInteger();
		}

		combination(list);
	}

	public static void combination(BigInteger[] list) {
	}

	public static BigInteger[] merge(BigInteger[] list) {
		// 结果数组
		BigInteger[] result = new BigInteger[]{};

		// 先对数组排序
		Arrays.sort(list, Collections.reverseOrder());
		// System.out.println(Arrays.asList(list).toString());
		// 从大到小组合

		return null;
	}
}
