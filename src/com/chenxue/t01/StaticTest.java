package com.chenxue.t01;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static s1=new Static();
		s1.age=19;
		s1.name="chenxue";
		s1.n();
		Static s2=new Static();
		s2.age=30;
		s2.name="cx";
		System.out.println("s1的age："+s1.age);
		System.out.println("s1的name："+s1.name);
		System.out.println("s2的age："+s2.age);
		System.out.println("s2的name："+s2.name);
		System.out.println(Static.name);
	}

}
