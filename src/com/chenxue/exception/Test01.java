package com.chenxue.exception;

import java.io.FileNotFoundException;

public class Test01 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub

		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
	public static void m1() throws FileNotFoundException {
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");
	}
	public static void m2() throws FileNotFoundException {
		System.out.println("m2 start");
		throw new FileNotFoundException();
//		System.out.println("m2 end");
	}

}
