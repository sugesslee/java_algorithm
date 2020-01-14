package com.lanqiaobei.the11;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/01/14     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/1/14 9:57 AM
 * @since 1.0.0
 */
@Slf4j
public class First {
	//	1048575/524288
	// sn = a1(1-q^n)/(1-q)
	public static void main(String[] args) {
		int temp = 0;
		for (int i = 0; i < 20; i++) {
			temp = temp + (int) Math.pow(2, i);
			log.info("the {}, temp = {}", i, temp);
		}
		log.info("pow(2, 19) = {}", Math.pow(2, 19));

		for (int j = 2; j < 524288; j++) {
			if (1048575 % j == 0 && 524288 % j == 0) {
				log.info("最小公约数: {}", j);
			}
		}
	}
}
