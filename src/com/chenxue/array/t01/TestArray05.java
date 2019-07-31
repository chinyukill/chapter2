package com.chenxue.array.t01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArray05 {

	public static void main(String[] args) {

		int[] a= {1,2,3,4};
		int[] b=new int[a.length*2];
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		参数解释：原数组，从哪个下标开始，目标数组，从目标数组哪个位置开始放，拷贝元素个数
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
