package com.huawei;


import java.util.Scanner;
import java.util.Stack;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/08/07     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019-08-07 16:45
 * @since 1.0.0
 * 1|(1&0)=1 ((!0&1))|0=1  1&0|0&1=0 !(1&0)|0&1=1
 * !(1&0)&0|0=0
 */
public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Solution solution = new Solution();
		String postfixExpression = solution.converToPostfix(input);

//		System.out.println(postfixExpression);

		int result = solution.numberCalculate(postfixExpression);
		System.out.println(result);
	}

	//对后缀表达式进行运算的函数
	private int numberCalculate(String postfix) throws Exception {
		Stack st = new Stack<>();//创建一个操作数栈
		for (int i = 0; postfix != null && i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			//如果为运算符
			if (isOperator(c) && !st.isEmpty()) {
				int d3 = 0;

				if (c == '!') {
					int d1 = Integer.parseInt(st.pop().toString());
					d3 = d1 == 0 ? 1 : 0;
				} else {
					int d2 = Integer.parseInt(st.pop().toString());
					int d1 = Integer.parseInt(st.pop().toString());

					if ('&' == c) {
						d3 = d1 & d2;
					}
					if ('|' == c) {
						d3 = d1 | d2;
					}
				}
				//将运算结果压入操作数栈中
				st.push(d3);
			} else {
				//为操作数时直接压入操作数栈
				st.push(c);
			}
		}
		return (int) st.pop();//返回运算结果
	}

	//将算术表达式转换为后缀表达式的函数，结果一字符串的形式返回
	private String converToPostfix(String expression) throws Exception {
		Stack<Character> st = new Stack<>();   //初始化一个运算符栈
		String postfix = new String();   //用于储存后缀表达式
		for (int i = 0; expression != null && i < expression.length(); i++) {
//			System.out.println(st);
			char c = expression.charAt(i);
			if (' ' != c) {
				//为左括号
				if (isOpenParent(c)) {
					st.push(c);
				}//为右括号
				else if (isCloseParent(c)) {
					char ac = st.pop();
					while (!isOpenParent(ac)) {
						postfix = postfix.concat(String.valueOf(ac));
						if (!st.empty()) {
							ac = st.pop();
						}
					}
					//左括号前面有!则pop
					char temp = st.pop();
					if (temp == '!') {
						postfix = postfix.concat(String.valueOf(temp));
					} else {
						st.push(temp);
					}

				}//为运算符
				else if (isOperator(c)) {
					//运算栈非空，取出栈顶优先级高的运算符送完后缀表达式
					if (!st.empty()) {
						char ac = st.pop();
						//栈取出的字符优先级比c高
						while (!st.isEmpty() && priority(ac) >= priority(c)) {
							postfix = postfix.concat(String.valueOf(ac));
							ac = st.pop();
						}//栈取出的字符优先级比c低，则将取出的字符重新入栈
						if (ac != ' ') {
							st.push(ac);
						}
					}
					st.push(c);    //将c入栈
				}//为操作数，直接串联到postfix内
				else {
					postfix = postfix.concat(String.valueOf(c));
				}
			}
		}//当表达式读完就将算术栈pop出加入postfix
		while (!st.isEmpty()) {
			postfix = postfix.concat(String.valueOf(st.pop()));
		}
		return postfix;
	}

	//判断字符为运算符
	private boolean isOperator(char c) {
		return '!' == c || '&' == c || '|' == c;
	}

	//判断字符为左括号
	private boolean isOpenParent(char c) {
		return c == '(';
	}

	//判断字符为右括号
	private boolean isCloseParent(char c) {
		return c == ')';
	}

	//判断算法的优先级
	private int priority(char c) {
		if (c == '!') {
			return 3;
		}
		if (c == '&') {
			return 2;
		} else if (c == '|') {
			return 1;
		} else return 0;
	}
}
