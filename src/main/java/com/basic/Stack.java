package com.basic;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/6 8:27 AM
 * @since 1.0.0
 */
public interface Stack<T> {
	/**
	 * 栈是否为空
	 * @return boolean
	 */
	boolean isEmpty();

	/**
	 * 入栈
	 * @param data 数据
	 */
	void push(T data);

	/**
	 * 返回栈顶元素，不出栈
	 * @return T
	 */
	T peek();

	/**
	 * 出栈操作
	 * @return T
	 */
	T pop();
}
