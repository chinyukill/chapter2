package com.chenxue.testlist;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		Student s1 = new Student("1001", "cindy", 22);
		Student s2 = new Student("1002", "abby", 22);
		Student s3 = new Student("1003", "dora", 22);
		Student s4 = new Student("1004", "amy", 22);
		Student s5 = new Student("1005", "jack", 22);
		Student s6 = new Student("1004", "amy", 22);
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		if (arrayList.contains(s6)) {
			arrayList.add(s5);
		}
//		for(int i=0;i<arrayList.size();i++) {
//			System.out.println(arrayList.get(i));
//		}
//		System.out.println(arrayList);
	}

}
