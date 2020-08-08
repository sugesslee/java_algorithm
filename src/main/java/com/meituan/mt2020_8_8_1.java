package com.meituan;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/08/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/8/8 4:05 PM
 * @since 1.0.0
 */
public class mt2020_8_8_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = in.nextInt();
		}
		int count = 0;
		float sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += a[i - 1] * i;
			count += a[i-1];
		}
		float result = sum / count;
		String res = String.valueOf(result);
		List<String> res_list = Arrays.asList(res.split("\\."));

		System.out.println(res_list.get(0) + "." + res_list.get(1).substring(0, 1));
	}
}
