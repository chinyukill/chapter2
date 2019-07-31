package com.chenxue.array.t01;

import java.util.Random;

public class TestArray07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//冒泡排序
		int num=new Random().nextInt(11)+3;
		System.out.println(num);
		int[] array=new int[num];
		for(int i=0;i<array.length;i++) {
			array[i]=new Random().nextInt(101);
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//0和1比较，小的往前放
		//1和2比较，小的往前放
		for(int i=array.length-1;i>0;i--) {
			int temp;
			for(int j=0;j<i;j++) {
				
				if (array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
