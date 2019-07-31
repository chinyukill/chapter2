/*package com.chenxue.t01;

public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPhone iPhone = new IPhone(10);
		IPhone iPhone2 = new IPhone();
//		System.out.println(iPhone.color);
//		System.out.println(iPhone.medel);
	}

}
class Phone {
	String color;
	String medel;
	public Phone() {
		System.out.println("父类无参构造方法");
	}
	public Phone(String color,String medel) {
		System.out.println("父类有参构造方法");
		this.color=color;
		this.medel=medel;
	}
}
class IPhone extends Phone{
	int a;
	public IPhone() {
		
	}
	public IPhone(int a) {
		//默认调用父类无参构造方法；若要调用父类有参构造方法要显式的去调用
		System.out.println("子类带参构造函数");
		this.a=a;
//		this.color="土豪金";
//		this.medel="IPhone";
	}
}
*/
package com.chenxue.t01;

/*
 * 使用super调用父类的构造方法
 */
public class TestSuper02 {

	public static void main(String[] args) {
		IPhoneX iPhoneX1 = new IPhoneX(10);
		
		IPhoneX iPhoneX2 = new IPhoneX();
		
//		System.out.println(iPhoneX.color);
//		System.out.println(iPhoneX.model);
	}

}

class IPhone{
	
	String color;
	
	String model;
	
	public IPhone() {
		System.out.println("父类的无参构造方法");
	}

	public IPhone(String color, String model) {
		System.out.println("父类的有参构造方法");
		this.color = color;
		this.model = model;
	}
	
	
}

class IPhoneX extends IPhone{
	
	int a;
	
	public IPhoneX() {
		//系统会默认调用父类的无参构造方法
		//通过下面语句去调用构造方法
		//如果没有显示的编写的话，系统会提供默认的
		//如果显示编写的话，一定要保证super出现在构造方法中的第一行
		//this(10);//this和super不能同时出现在构造方法中
		//super("土豪金","iPhone x");//手动调用父类中的有参构造方法
		System.out.println("子类无参构造");
		System.out.println(this.a);
	}

	public IPhoneX(int a) {
		
		this();
		//super("土豪金","iPhone x");
		System.out.println("子类有参的构造方法");
		this.a = a;
		System.out.println(this.a);
	}
	
	
}
