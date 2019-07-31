package com.chenxue.thread;

public class TestInterrupt02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Process02 p1 = new Process02();
		Thread t1 = new Thread(p1,"t1");
		t1.start();
		try {
			Thread.sleep(80);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.setFlag(true);
	}

}
