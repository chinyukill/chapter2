package com.chenxue.testlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
//		for(int i=0;i<list.size();i++) {
//			list.remove(i);
//			
//		}
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		System.out.println(list);
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
//		for(Object obj:linkedList) {
//			linkedList.remove(obj);
//		}
		Iterator iterator =linkedList.iterator();
		while (iterator.hasNext()) {
			Integer next = (Integer)iterator.next();
			iterator.remove();
			
		}
		System.out.println(linkedList);
	}

}
