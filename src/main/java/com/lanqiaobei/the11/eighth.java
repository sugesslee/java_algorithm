package com.lanqiaobei.the11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * eighth
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/01/20     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/1/20 4:18 PM
 * @since 1.0.0
 */
public class eighth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());

		String[] tempArr = new String[7];
		for (int i = 0; i < N; i++) {
			tempArr[i] = in.nextLine();
		}
		System.out.println(Arrays.asList(tempArr).toString());
	}
}
