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
 * @version 1.0.0 2020/1/14 11:05 AM
 * @since 1.0.0
 */
@Slf4j
public class Second {
	public static void main(String[] args) {
		// 1901年1.1 星期二
		// 总共5217个星期一
		int allDay = 0;
		for (int i = 1901; i <= 2000; i++) {
			if (i % 4 == 0) {
				allDay += 366;
			} else {
				allDay += 365;
			}
		}
		log.info("allDay: {}", allDay);
		log.info("总共有{}个星期，剩余{}天", (allDay - 6) / 7, (allDay - 6) % 7);
	}
}
