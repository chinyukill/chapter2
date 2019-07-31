package com.chenxue.array.t01;

import java.util.Random;

public class TestArray04 {

	public static void main(String[] args) {

		//数组扩容，数组拷贝
		int[] a= {1,2,3};
		int r=new Random().nextInt(5)+1;
		System.out.println(r);
		int[] b=new int[a.length*r];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
		printarray(a);
	}
	public static void printarray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		
	}

}
