package com.meituan;

import com.basic.Tree.TreeNode;

import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/08/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/8/8 5:30 PM
 * @since 1.0.0
 * 小团作为一名美团骑手，最喜欢的颜色就是黄和黑，因此对包含这两种颜色的事物都格外留意。
 * <p>
 * 这天他发现有一棵树，树上的每个节点都是黄的或者黑的。现在小团想知道对于这棵树中的每个节点，在以其为根的子树中，所有与其颜色不同的节点的深度之和是多少。子树中节点的深度被定义为该节点与该子树根节点之间的最短路径的边数。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 第一行有一个数n，代表这棵树上一共有n个节点，编号为1~n。(1<n<=100000)
 * <p>
 * 第二行有n个数，第i个数表示编号为i的节点的颜色，为0表示黄色，为1表示黑色。
 * <p>
 * 第三行有n-1个数，第i个数表示编号为i+1的节点的父节点编号。
 * <p>
 * 输出描述
 * 在一行中输出n个数，第i个数代表第i个节点的答案。
 */
public class mt2020_8_8_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] color = new int[n];
		for (int i = 0; i < n; i++) {
			color[i] = in.nextInt();
		}
		int[] ds = new int[n - 1];
		for (int j = 0; j < n - 1; j--) {

		}
	}
}

class Node {
	int val;
	TreeNode left;
	TreeNode right;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	Node(int x) {
		val = x;
	}
}