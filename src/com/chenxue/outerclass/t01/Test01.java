package com.chenxue.outerclass.t01;

import com.chenxue.outerclass.t01.OuterClass.InnerClass;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass.InnerClass.i1();
		//�����ڲ���Ǿ�̬�������������ͨ��������.����
		InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.i2();
	}

}
