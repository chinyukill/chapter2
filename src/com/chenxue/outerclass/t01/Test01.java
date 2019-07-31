package com.chenxue.outerclass.t01;

import com.chenxue.outerclass.t01.OuterClass.InnerClass;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass.InnerClass.i1();
		//调用内部类非静态方法，创造对象，通过对象名.方法
		InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.i2();
	}

}
