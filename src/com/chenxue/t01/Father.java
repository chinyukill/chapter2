package com.chenxue.t01;

public class Father {

	static {
		//静态代码块
		System.out.println("父类静态代码块");
	}
	{
		System.out.println("父类构造代码块");
	}
	public Father(){
		System.out.println("父类构造方法");
	}
}
