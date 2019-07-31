package com.chenxue.string.t01;

public class TestString01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="a,b,C,d,e";
		String s1=string.toUpperCase();
		System.out.println(s1);
		System.out.println(string);
		String s2 = string.toLowerCase();
		System.out.println(s2);
		System.out.println(string);
		String[] c=string.split(",");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}

}
