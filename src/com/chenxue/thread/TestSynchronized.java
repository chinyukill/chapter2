package com.chenxue.thread;

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Process p1 = new Process();
		Process p2 = new Process();
		Thread t1 = new Thread(p1,"p1");
		Thread t2 = new Thread(p2, "t2");
		t1.start();
		t2.start();
	}

}
