package com.chenxue.t01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestLocalDate {

	public static void main(String[] args) {

		//localdate   2019-06-24
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		int year=date1.getYear();
		int month=date1.getMonthValue();
		int day=date1.getDayOfMonth();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		String date2 = date1.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
		System.out.println(date2);
		boolean leapYear = date1.isLeapYear();
		System.out.println(leapYear);
		
		int lengthOfMonth = date1.lengthOfMonth();
		System.out.println(lengthOfMonth);//获取当前月份有多少天
		
		
		LocalDate date3 = LocalDate.parse("2019-06-20");
		LocalDate date4 = LocalDate.of(2019, 6, 20);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date3.equals(date4));
		
		LocalDate nextWeek = date1.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek);
		
	}

}
