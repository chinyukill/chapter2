package com.chenxue.testlist;

import java.util.jar.Pack200;

public class Person implements Comparable<Person>{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
//		if (this.id<o.getId()) {
//			return -1;
//		}else if (this.id==o.getId()) {
//			return 0;
//		}else {
//			return 1;
//		}
//		return compare(this, o);
//		return this.name.compareTo(o.getName());
		//根据id排序，id相同根据name排序
		if (this.id<o.getId()) {
			return -1;
		}else if (this.id==o.getId()) {
			
			return this.name.compareTo(o.getName());
		}else {
			return 1;
		}
		
	}
	public static int compare(Person p1,Person p2) {
		return p1.getId()>p2.getId()?1:p1.getId()==p2.getId()?0:-1;
	}
	

}
