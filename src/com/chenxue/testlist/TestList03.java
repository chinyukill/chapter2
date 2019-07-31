package com.chenxue.testlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TestList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		Iterator<Integer> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
