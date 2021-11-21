package com.greatlearning.corejava;


class Polymorphism{
	int findArea(int a, int b)
	{
		return a*b;
	}
	int findArea(int a, int b,int c)
	{
		return a*b*c;
	}
}
public class PolymorphismOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism obj = new Polymorphism();
		System.out.println("Poly 1 method "+ obj.findArea(10, 20));
		System.out.println("Poly 2 method "+ obj.findArea(10, 20,30));
	}

}
