package com.chenxue.t01;

import java.time.LocalTime;

public class TestLocalTime {

	public static void main(String[] args) {

		LocalTime time1 = LocalTime.now();
		System.out.println(time1);//22:11:13.412��ȷ������
		System.out.println(time1.withNano(0));//ȥ������
		
		//��ȡ��Сʱ���ʱ��
		LocalTime plusHours = time1.plusHours(2);
		System.out.println(plusHours);
		
		//����ʱ��
		LocalTime time2 = LocalTime.parse("08:20:12");
		LocalTime time3 = LocalTime.of(8, 20, 12);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time2.equals(time3));
		
	}

}
