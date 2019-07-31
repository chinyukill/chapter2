package com.chenxue.exception;

import java.io.FileNotFoundException;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}
	public static void m1() {
		System.out.println("m1 start");
		try {
			m2();
			System.out.println("抛出异常后不执行的语句");
//		}catch (FileNotFoundException e) {
//			// TODO: handle exception
//			System.out.println("catch");
//		}
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("catch");
			e.printStackTrace();
		}
		
		
		System.out.println("m1 end");
	}
	public static void m2(){
		System.out.println("m2 start");
//		throw new FileNotFoundException();
		System.out.println(1/0);
//		System.out.println("m2 end");
	}

}
