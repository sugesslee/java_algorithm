package com.min300.chapter2;

import lombok.ToString;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/05     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/5 2:39 PM
 * @since 1.0.0
 */
@ToString
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

}
