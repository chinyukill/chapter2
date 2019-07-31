package com.chenxue.outerclass.t01;

public class OuterClass {

	

		//静态变量
		private static String s1="helloworld";
		//成员变量
		private String s2="chenxue";
		
		public static void o1() {
			System.out.println("外部静态方法");
		}
		public void o2() {
			System.out.println("外部类的成员方法");
		}
		
		//表示静态内部类
 		static class InnerClass{
 			//静态方法
			public static void i1() {
				System.out.println(s1);
//				System.out.println(s2);
				
				o1();
			}
			//非静态方法
			public void i2() {
				System.out.println("内部类的非静态方法");
//				System.out.println(s1);
//				System.out.println(s2);只能访问外部类中的静态变量
//				o2();只能访问外部类的静态方法
				
			}
		}
	

}
