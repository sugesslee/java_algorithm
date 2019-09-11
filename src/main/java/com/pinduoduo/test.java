package com.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * pinduoduo test
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/07/28     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019-07-28 14:29
 * @since 1.0.0
 */
public class test {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		get_kh(input);
	}

	private static void get_kh(String input) {

		System.out.println(input);

		String result = input.substring(input.indexOf("(") + 1, input.indexOf(")"));


		System.out.println(result);
	}
}
