package com.basic.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/21     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/21 10:44 PM
 * @since 1.0.0
 */
public class OriginLinkedList {
	public static void main(String[] args) {
		List linkedList = new LinkedList();

		linkedList.add(1);

		System.out.println(linkedList.get(0));
	}
}
