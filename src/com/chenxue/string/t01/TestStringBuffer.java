package com.chenxue.string.t01;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100);
		//��ƴ�ӵ��ַ����ĳ��Ƚ���Ԥ�����ײ�ɼ������鿽���Ĳ������Ӷ�ʵ�����ܵ�������
		sb.append("hello ");
		sb.append("chenxue ");
		sb.append("welcome to chengdu!");
		System.out.println(sb);
		String s2=sb.toString();
		String string="hello chenxue welcome to chengdu!";
		System.out.println(s2==string);
	}

}
