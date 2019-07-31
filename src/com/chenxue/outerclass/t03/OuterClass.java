package com.chenxue.outerclass.t03;
//局部内部类
public class OuterClass {

	
	public void o1() {
		
		class InnerClass{
			public void i1() {
				System.out.println("局部内部类的i1方法");
			}
		}
		InnerClass innerClass = new InnerClass();
		innerClass.i1();
	}
}
