package com.baidu.javadev;

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
public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
	}
}
