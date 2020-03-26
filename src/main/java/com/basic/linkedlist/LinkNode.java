package com.basic.linkedlist;

import lombok.*;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/11     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/11 11:28 AM
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LinkNode {
	/**
	 * 数据域
	 */
	private int data;
	/**
	 * 指针域
	 */
	private LinkNode next;

	public LinkNode(int data){
		this.data = data;
	}
}
