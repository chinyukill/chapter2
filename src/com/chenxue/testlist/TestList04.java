package com.chenxue.testlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestList04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,3,2,4,5,6};
		Arrays.sort(a);
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("d");
		arrayList.add("e");
		arrayList.add("c");
		arrayList.add("a");
		arrayList.add("g");
		arrayList.add("f");
		arrayList.add("h");
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(2);
		arrayList2.add(1);
		arrayList2.add(5);
		arrayList2.add(0);
		Collections.sort(arrayList2);
		System.out.println(arrayList2);
		
	}

}
