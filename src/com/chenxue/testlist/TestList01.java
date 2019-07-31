package com.chenxue.testlist;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class TestList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List list = new ArrayList();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.add("e");
//		System.out.println(list);
//		list.add(5, "f");
//		System.out.println(list);
//		System.out.println(list.get(3));
//		list.remove(2);
//		System.out.println(list);
//		System.out.println(list.size());//查询快增删慢，默认长度为十的数组
//		List list = new LinkedList();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.add("e");
//		System.out.println(list);
//		list.add(5, "f");
//		System.out.println(list);
//		System.out.println(list.get(3));
//		list.remove(2);
//		System.out.println(list);
//		System.out.println(list.size());//链表，查询慢增删快
		List arrayList = new ArrayList();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("chenxue");
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
//		//增强for循环
//		for(Object obj:arrayList) {
//			System.out.println(obj);
//		}
		//迭代器
		Iterator iter = arrayList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
