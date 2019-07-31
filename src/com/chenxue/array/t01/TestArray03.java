package com.chenxue.array.t01;

import java.util.Random;

public class TestArray03 {

	public static void main(String[] args) {

//		给出一个数组找出数组中的最大值
		int[] arr= new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=new Random().nextInt(101);
		}
		
		
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			System.out.print(arr[i]+"\t");
		}
		System.out.println("最大值"+max);
	}

}
