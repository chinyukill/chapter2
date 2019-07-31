package com.chenxue.t01;

import java.time.LocalTime;

public class TestLocalTime {

	public static void main(String[] args) {

		LocalTime time1 = LocalTime.now();
		System.out.println(time1);//22:11:13.412精确到毫秒
		System.out.println(time1.withNano(0));//去除毫秒
		
		//获取两小时后的时间
		LocalTime plusHours = time1.plusHours(2);
		System.out.println(plusHours);
		
		//设置时间
		LocalTime time2 = LocalTime.parse("08:20:12");
		LocalTime time3 = LocalTime.of(8, 20, 12);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time2.equals(time3));
		
	}

}
