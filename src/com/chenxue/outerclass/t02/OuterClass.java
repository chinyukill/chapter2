package com.chenxue.outerclass.t02;

public class OuterClass {
/*
 * 成员内部类
 */
	private static String s1="chenxue";
	private String s2="helloworld";
	private static void o1() {
		System.out.println("外部类中的静态方法");
	}
	private void o2() {
		System.out.println("外部类中的成员方法");
	}
	class InnerClass{
		public void i1() {
			System.out.println("内部类成员方法");
			System.out.println(s1);
			System.out.println(s2);
			o1();
			o2();
		}
	}
}
