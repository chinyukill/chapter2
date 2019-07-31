package com.chenxue.outerclass.t02;

import com.chenxue.outerclass.t02.OuterClass.InnerClass;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClass = new OuterClass();
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.i1();
	}

}
