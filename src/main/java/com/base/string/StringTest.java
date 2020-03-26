package com.base.string;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/26     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/26 2:44 PM
 * @since 1.0.0
 */
@Slf4j
public class StringTest {
	private static String BASE_STR = "Mr.li";
	private static final int COUNT = 2000000;

	public static void main(String[] args) {
		stringTest();
		stringBufferTest();
		stringBuilderTest();
	}

	private static void stringTest() {
		String str = new String(BASE_STR);
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT / 100; i++) {
			str = str + "miss";
		}
		log.info("String speed time: {}ms", System.currentTimeMillis() - start);
	}

	private static void stringBufferTest() {
		StringBuffer str = new StringBuffer(BASE_STR);
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			str.append("miss");
		}
		log.info("String Buffer speed time: {}ms", System.currentTimeMillis() - start);
	}

	private static void stringBuilderTest() {
		StringBuilder str = new StringBuilder(BASE_STR);
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			str.append("miss");
		}
		log.info("String Builder speed time: {}ms", System.currentTimeMillis() - start);
	}


}
