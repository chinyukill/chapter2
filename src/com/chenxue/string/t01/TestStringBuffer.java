package com.chenxue.string.t01;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100);
		//对拼接的字符串的长度进行预估，底层可减少数组拷贝的操作，从而实现性能的提升；
		sb.append("hello ");
		sb.append("chenxue ");
		sb.append("welcome to chengdu!");
		System.out.println(sb);
		String s2=sb.toString();
		String string="hello chenxue welcome to chengdu!";
		System.out.println(s2==string);
	}

}
