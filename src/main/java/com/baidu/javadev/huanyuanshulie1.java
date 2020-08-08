package com.baidu.javadev;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/29     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/29 7:37 PM
 * @since 1.0.0
 */
public class huanyuanshulie1 {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		BigInteger[] arr = new BigInteger[n];
//		in.nextLine();
//		for (int i = 0; i < n; i++) {
//			arr[i] = in.nextBigInteger();
//		}
//		Arrays.sort(arr);
//		int k = 0;
//		while (arr[n - 1].compareTo(new BigInteger(String.valueOf(n))) >= 0) {
//			arr[n - 1] = arr[n - 1].subtract(new BigInteger(String.valueOf(n)));
//			for (int i = 0; i < n - 2; i++) {
//				arr[i] = arr[i].add(new BigInteger(String.valueOf(1)));
//			}
//			Arrays.sort(arr);
//			k += 1;
//		}
//		System.out.print(k);
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigDecimal[] arr = new BigDecimal[n];
		in.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextBigDecimal();
		}
		Arrays.sort(arr);

		int k = 0;
		while (arr[n - 1].compareTo(new BigDecimal(String.valueOf(n))) >= 0) {
			arr[n - 1] = arr[n - 1].subtract(new BigDecimal(String.valueOf(n)));
			for (int i = 0; i < n - 2; i++) {
				arr[i] = arr[i].add(new BigDecimal(String.valueOf(1)));
			}
			Arrays.sort(arr);
			k += 1;
		}
		System.out.print(k);
	}
}
