package com.chenxue.outerclass.t04;

public class Test01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		m1(dog);
		
		//�����ڲ���
		m1(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("è����");
				
			}
		});
	}

	public static void m1(Animal a) {
		a.eat();
	}
}
