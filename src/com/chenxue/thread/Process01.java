package com.chenxue.thread;

public class Process01 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=0;i<100;i++) {
			if (i==50) {
				
				try {
					
					System.out.println("----"+Thread.currentThread().interrupted());
					Thread.sleep(100);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.currentThread();
					
					System.out.println("end");
					System.out.println("++++"+Thread.currentThread().interrupted());
					break;
				}
			}
			System.out.println(Thread.currentThread().getName()+"===>"+i);
		}
	}

}
