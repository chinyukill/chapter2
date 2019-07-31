package com.chenxue.outerclass.t04;

public class Test01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		m1(dog);
		
		//匿名内部类
		m1(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("猫吃鱼");
				
			}
		});
	}

	public static void m1(Animal a) {
		a.eat();
	}
}
