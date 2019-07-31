package com.chenxue.thread;

public class Process implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Process.class) {
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+"===>"+i);
			}
		}
		
	}

}
