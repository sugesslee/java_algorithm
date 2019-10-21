package com.pufa;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/21     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/21 7:40 PM
 * @since 1.0.0
 */
public class test {
	private static double array[] = new double[10];

	public static void main(String[] args) {
		System.out.println(array[9]);


		Object object = new Object() {
			public boolean equal(Object obj) {
				return true;
			}
		};
		System.out.println(object.equals("hello"));
	}
}
