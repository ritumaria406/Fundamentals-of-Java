package com.greatlearning.corejava;

class A{
	void car() {
		System.out.println("I am method A");
	}
}

class B extends A{
	void car() {
		System.out.println("I am method B");
	}
}

public class PolymorphismExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.car();
		A obj1 = new B();
		obj1.car();

	}

}
