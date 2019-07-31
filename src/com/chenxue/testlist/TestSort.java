package com.chenxue.testlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
//向集合中添加person类，并排序
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> arrayList = new ArrayList<>();
		arrayList.add(new Person(101,"jack"));
		arrayList.add(new Person(101,"abel"));
		arrayList.add(new Person(231,"cindy"));
		arrayList.add(new Person(141,"paul"));
		arrayList.add(new Person(151,"kidd"));
		arrayList.add(new Person(871,"kucy"));
		Collections.sort(arrayList);
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
	}

}
