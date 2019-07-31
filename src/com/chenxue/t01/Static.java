package com.chenxue.t01;

public class Static {

	int age;
	static String name;
	public void m() {
		System.out.println("m");
	}
	public void n() {
		System.out.println("n");
		x();
		m();
	}
	public static void x() {
		System.out.println("x");
	}
	
}
