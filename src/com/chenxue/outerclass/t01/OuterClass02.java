package com.chenxue.outerclass.t01;

public class OuterClass02 {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.outer_method();
	}
}
class Outer{
	public int i=10;
	public void outer_method() {
		System.out.println("waibuleifangfa");
		int a=20;
		class Inner{
			public void inner_method() {
				System.out.println("neibuleifangfa"+a);
			}
		}
		Inner inn=new Inner();
		inn.inner_method();
	}
}
