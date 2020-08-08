package com.baidu.javadev;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/29     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/29 7:30 PM
 * @since 1.0.0
 */
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger[] arr = new BigInteger[n];
		in.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextBigInteger();
		}
		System.out.println(arr);
	}
}
