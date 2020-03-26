package com.meituan;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/24     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/24 8:22 AM
 * @since 1.0.0
 */
public class aAddB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str1 = in.next();
		String str2 = in.next();

		BigDecimal b1 = new BigDecimal(str1.replace("\"", ""));
		BigDecimal b2 = new BigDecimal(str2.replace("\"", ""));

		BigDecimal result = b1.add(b2);
		System.out.println("\"" + result + "\"");
	}
}
