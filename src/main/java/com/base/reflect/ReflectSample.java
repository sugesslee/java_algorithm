package com.base.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/20     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/20 7:25 PM
 * @since 1.0.0
 */
public class ReflectSample {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
		Class rc = Class.forName("com.base.reflect.Robot");
		Robot rcInterfaces = (Robot) rc.newInstance();
		System.out.println("Class name is : " + rc.getName());

		Method getHello = rc.getDeclaredMethod("throwHello", String.class);
		getHello.setAccessible(true);

		Object str = getHello.invoke(rcInterfaces, "Bob");
		System.out.println("getHello result is " + str);

		Method sayHi = rc.getMethod("sayHi", String.class);
		sayHi.invoke(rcInterfaces, "Welcome");

		Field name = rc.getDeclaredField("name");
		name.setAccessible(true);
		name.set(rcInterfaces, "lily");
		sayHi.invoke(rcInterfaces, "Welcome");

		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println(System.getProperty("java.class.path"));
	}
}
