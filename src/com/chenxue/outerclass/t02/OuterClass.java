package com.chenxue.outerclass.t02;

public class OuterClass {
/*
 * ��Ա�ڲ���
 */
	private static String s1="chenxue";
	private String s2="helloworld";
	private static void o1() {
		System.out.println("�ⲿ���еľ�̬����");
	}
	private void o2() {
		System.out.println("�ⲿ���еĳ�Ա����");
	}
	class InnerClass{
		public void i1() {
			System.out.println("�ڲ����Ա����");
			System.out.println(s1);
			System.out.println(s2);
			o1();
			o2();
		}
	}
}
