package com.chenxue.outerclass.t03;
//�ֲ��ڲ���
public class OuterClass {

	
	public void o1() {
		
		class InnerClass{
			public void i1() {
				System.out.println("�ֲ��ڲ����i1����");
			}
		}
		InnerClass innerClass = new InnerClass();
		innerClass.i1();
	}
}
