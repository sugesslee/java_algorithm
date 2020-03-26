package com.basic.Tree;

import java.util.*;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/10     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/10 10:35 AM
 * @since 1.0.0
 */
public class Traversal {
	/**
	 * 二叉树前序递归遍历
	 *
	 * @param treeNode tree
	 */
	public static void preOrderRecursion(TreeNode treeNode) {
		if (treeNode == null)
			return;
		TreeNode.visit(treeNode);
		preOrderRecursion(treeNode.getLeft());
		preOrderRecursion(treeNode.getRight());
	}

	/**
	 * 二叉树前序非递归遍历
	 *
	 * @param treeNode treeNode
	 * @return list
	 */
	public static List<Integer> preOrderTraversal(TreeNode treeNode) {
		List<Integer> resultList = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		if (treeNode == null)
			return null;
		stack.push(treeNode);
		while (!stack.isEmpty()) {
			TreeNode tempNode = stack.pop();
			if (tempNode != null) {
				resultList.add(tempNode.val);
				stack.push(tempNode.getRight());
				stack.push(tempNode.getLeft());
			}
		}
		return resultList;
	}

	/**
	 * 二叉树中序递归遍历
	 *
	 * @param treeNode treeNode
	 */
	public static void inOrderRecursion(TreeNode treeNode) {
		if (treeNode == null)
			return;
		inOrderRecursion(treeNode.getLeft());
		TreeNode.visit(treeNode);
		inOrderRecursion(treeNode.getRight());
	}

	/**
	 * 非递归中序遍历
	 */
	public List<Integer> inorderTraversalNonCur(TreeNode root) {
		List<Integer> visitedList = new ArrayList<>();
		Map<TreeNode, Integer> visitedNodeMap = new HashMap<>();//保存已访问的节点
		Stack<TreeNode> toBeVisitedNodes = new Stack<>();//待访问的节点
		if (root == null)
			return visitedList;
		toBeVisitedNodes.push(root);
		while (!toBeVisitedNodes.isEmpty()) {
			TreeNode tempNode = toBeVisitedNodes.peek(); //注意这里是peek而不是pop
			while (tempNode.left != null) { //如果该节点的左节点还未被访问，则需先访问其左节点
				if (visitedNodeMap.get(tempNode.left) != null) //该节点已经被访问（不存在某个节点已被访问但其左节点还未被访问的情况）
					break;
				toBeVisitedNodes.push(tempNode.left);
				tempNode = tempNode.left;
			}
			tempNode = toBeVisitedNodes.pop();//访问节点
			visitedList.add(tempNode.val);
			visitedNodeMap.put(tempNode, 1);//将节点加入已访问map
			if (tempNode.right != null) //将右结点入栈
				toBeVisitedNodes.push(tempNode.right);
		}
		return visitedList;
	}

	public static void main(String[] args) {
		preOrderRecursion(new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(6)), new TreeNode(3)));
		System.out.println();
		inOrderRecursion(new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(6)), new TreeNode(3)));
		System.out.println();
		List<Integer> resultPre = preOrderTraversal(
				new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(6)), new TreeNode(3)));
		System.out.println(resultPre);
	}
}
