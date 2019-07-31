package com.chenxue.t01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class TestLocalDateTime {

	public static void main(String[] args) {

		LocalTime time1 = LocalTime.of(9, 50, 24);
		LocalTime time2 = LocalTime.of(5, 40, 32);
		Duration between = Duration.between(time2, time1);
		System.out.println(between.getSeconds());
		LocalDate date1 = LocalDate.of(2019, 06, 25);
		LocalDate date2 = LocalDate.of(1996, 12, 3);
		Period between2 = Period.between(date2, date1);
		
		System.out.println(between2.getYears());
		System.out.println(between2.getMonths());
		System.out.println(between2.getDays());
		
		LocalDateTime end = LocalDateTime.of(date1, time1);
		LocalDateTime start=LocalDateTime.of(date2, time2);
		Duration between3 = Duration.between(start, end);
		System.out.println(between3.toDays());
		
	}

}
