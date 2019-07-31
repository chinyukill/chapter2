package com.chenxue.t01;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Integer i1=new Integer(10);
//		Integer i2=new Integer(10);
//		System.out.println(i1==i2);
//		System.out.println(i1.equals(i2));
//		
//		
//		Integer i3 = new Integer(200);
//		Integer i4 = new Integer(200);
//		System.out.println(i3==i4);
//		System.out.println(i3.equals(i4));
//		
//		
//		Integer i5=Integer.valueOf(5);
//		Integer i6=Integer.valueOf(5);
//		System.out.println(i5==i6);
//		System.out.println(i5.equals(i6));
//		
//		Integer i7=Integer.valueOf(500);
//		Integer i8=Integer.valueOf(500);
//		System.out.println(i7==i8);
//		System.out.println(i7.equals(i8));
//		
//		
//		Integer i9=Integer.parseInt("1234");
//		System.out.println(i9);
//		String string=String.valueOf(123);
//		if (string instanceof String) {
//			System.out.println(string);
//		}
//		
//		
//		
//		BigDecimal bd1 = new BigDecimal("8.4");
//		BigDecimal bd2 = new BigDecimal("4.2");
//		System.out.println(bd1.add(bd2));
//		System.out.println(bd1.divide(bd2));
//		System.out.println(bd1.multiply(bd2));
//		System.out.println(bd1.subtract(bd2));
//		
//		DecimalFormat df = new DecimalFormat("###,###.##");
//		int num=9999999;
//		System.out.println(df.format(num));
//		
//		
//		Random r = new Random();
//		System.out.println(r.nextInt(101));
//		
	
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
		
	}

}
