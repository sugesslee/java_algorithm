package com.basic.Tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/10     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/10 10:33 AM
 * @since 1.0.0
 */
@Data
@ToString
@AllArgsConstructor
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public static void visit(TreeNode node) {
		System.out.print(node.val + " ");
	}
}
