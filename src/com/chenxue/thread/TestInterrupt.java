package com.chenxue.thread;

public class TestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Process01 p1 = new Process01();
		Thread t1 = new Thread(p1,"t1");
		t1.start();
		t1.interrupt();
	}

}
