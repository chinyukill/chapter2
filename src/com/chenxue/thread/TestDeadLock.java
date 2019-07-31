package com.chenxue.thread;

public class TestDeadLock {

	static Object o1 = new Object();
	static Object o2 = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(()->{
			synchronized(o1) {
				System.out.println(Thread.currentThread().getName()+"   ->o1");
				synchronized (o2) {
					System.out.println(Thread.currentThread().getName()+"==>o2");
					
				}
			}
		});
		Thread t2 = new Thread(()->{
			synchronized(o2) {
				System.out.println(Thread.currentThread().getName()+"   ->o2");
				synchronized (o1) {
					System.out.println(Thread.currentThread().getName()+"==>o1");
					
				}
			}
		});
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
	}

}
