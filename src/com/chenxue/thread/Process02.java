package com.chenxue.thread;

public class Process02 implements Runnable {

	private static boolean flag;
	public static boolean isFlag() {
		return flag;
	}
	public static void setFlag(boolean flag) {
		Process02.flag = flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (flag) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+"===>"+i);
		}
		
	}

}
