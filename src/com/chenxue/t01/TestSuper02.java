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
		System.out.println("�����޲ι��췽��");
	}
	public Phone(String color,String medel) {
		System.out.println("�����вι��췽��");
		this.color=color;
		this.medel=medel;
	}
}
class IPhone extends Phone{
	int a;
	public IPhone() {
		
	}
	public IPhone(int a) {
		//Ĭ�ϵ��ø����޲ι��췽������Ҫ���ø����вι��췽��Ҫ��ʽ��ȥ����
		System.out.println("������ι��캯��");
		this.a=a;
//		this.color="������";
//		this.medel="IPhone";
	}
}
*/
package com.chenxue.t01;

/*
 * ʹ��super���ø���Ĺ��췽��
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
		System.out.println("������޲ι��췽��");
	}

	public IPhone(String color, String model) {
		System.out.println("������вι��췽��");
		this.color = color;
		this.model = model;
	}
	
	
}

class IPhoneX extends IPhone{
	
	int a;
	
	public IPhoneX() {
		//ϵͳ��Ĭ�ϵ��ø�����޲ι��췽��
		//ͨ���������ȥ���ù��췽��
		//���û����ʾ�ı�д�Ļ���ϵͳ���ṩĬ�ϵ�
		//�����ʾ��д�Ļ���һ��Ҫ��֤super�����ڹ��췽���еĵ�һ��
		//this(10);//this��super����ͬʱ�����ڹ��췽����
		//super("������","iPhone x");//�ֶ����ø����е��вι��췽��
		System.out.println("�����޲ι���");
		System.out.println(this.a);
	}

	public IPhoneX(int a) {
		
		this();
		//super("������","iPhone x");
		System.out.println("�����вεĹ��췽��");
		this.a = a;
		System.out.println(this.a);
	}
	
	
}
