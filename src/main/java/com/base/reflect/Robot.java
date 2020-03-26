package com.base.reflect;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/20     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/20 7:22 PM
 * @since 1.0.0
 */
public class Robot {
	private String name;

	public void sayHi(String helloSentence) {
		System.out.println(helloSentence + " " + name);
	}

	private String throwHello(String tag) {
		return "Hello " + tag;
	}

	static {
		System.out.println("Hello robot");
	}
}
