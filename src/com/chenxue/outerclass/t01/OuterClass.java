package com.chenxue.outerclass.t01;

public class OuterClass {

	

		//��̬����
		private static String s1="helloworld";
		//��Ա����
		private String s2="chenxue";
		
		public static void o1() {
			System.out.println("�ⲿ��̬����");
		}
		public void o2() {
			System.out.println("�ⲿ��ĳ�Ա����");
		}
		
		//��ʾ��̬�ڲ���
 		static class InnerClass{
 			//��̬����
			public static void i1() {
				System.out.println(s1);
//				System.out.println(s2);
				
				o1();
			}
			//�Ǿ�̬����
			public void i2() {
				System.out.println("�ڲ���ķǾ�̬����");
//				System.out.println(s1);
//				System.out.println(s2);ֻ�ܷ����ⲿ���еľ�̬����
//				o2();ֻ�ܷ����ⲿ��ľ�̬����
				
			}
		}
	

}
