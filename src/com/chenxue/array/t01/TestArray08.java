package com.chenxue.array.t01;

import java.util.Arrays;
import java.util.Random;

public class TestArray08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ѡ������
		int num=new Random().nextInt(2)+3;
		System.out.println(num);
		int[] array=new int[num];
		for(int i=0;i<array.length;i++) {
			array[i]=new Random().nextInt(101);
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//0��1�Ƚ�
		//0��2�Ƚ�
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {				
				int temp;
				if (array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		
	}

}
