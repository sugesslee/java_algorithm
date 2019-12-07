package com.basic;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/6 8:31 AM
 * @since 1.0.0
 */
public class SeqStack<T> implements Stack<T>, Serializable {

	private static final long serialVersionUID = 7079607513286671231L;

	// 栈顶为-1
	private int top = -1;
	// 栈容量为10
	private int capacity = 10;
	// 存放元素的数组
	private T[] array;
	private int size;

	public SeqStack(int capacity) {
		array = (T[]) new Object[capacity];
	}

	public SeqStack() {
		array = (T[]) new Object[this.capacity];
	}

	/**
	 * 栈是否为空
	 *
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}

	/**
	 * 入栈
	 *
	 * @param data 数据
	 */
	@Override
	public void push(T data) {

	}

	/**
	 * 返回栈顶元素，不出栈
	 *
	 * @return T
	 */
	@Override
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return array[top];
	}

	/**
	 * 出栈操作
	 *
	 * @return T
	 */
	@Override
	public T pop() {
		return null;
	}
}
