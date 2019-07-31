package com.chenxue.t01;
//子类
public class Son extends Father{

	static {
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类构造代码块");
	}
	public Son() {
		System.out.println("子类构造方法");
	}
}
