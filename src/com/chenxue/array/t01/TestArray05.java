package com.chenxue.array.t01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArray05 {

	public static void main(String[] args) {

		int[] a= {1,2,3,4};
		int[] b=new int[a.length*2];
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		�������ͣ�ԭ���飬���ĸ��±꿪ʼ��Ŀ�����飬��Ŀ�������ĸ�λ�ÿ�ʼ�ţ�����Ԫ�ظ���
		System.arraycopy(a, 0, b, 0, a.length);
		a=b;
		printarray(a);
		int[] c= {3,4,57,865};
		c=Arrays.copyOf(c, 9);
		printarray(c);
	}
	public static void printarray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
	}


}
