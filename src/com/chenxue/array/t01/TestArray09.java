package com.chenxue.array.t01;

import java.util.Arrays;

public class TestArray09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//¶þ·Ö·¨
		int[] a= {1,4,5,7,31,88,121};
		int num=Arrays.binarySearch(a,5);
		System.out.println(num);
		
		int key=7;
		int low=0,high=a.length-1;
		int mid;
		while (high>=low) {
			mid=(high+low)/2;
			if (key>a[mid]) {
				low=mid+1;
			}else if (key<a[mid]) {
				high=mid-1;
			}else {
				System.out.println(mid);
				return;
			}
		}
	}

}
