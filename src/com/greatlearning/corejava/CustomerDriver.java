package com.greatlearning.corejava;


class Customer{
	protected int age=29;
	private int weight= 56; 
	public int size=28;
	
	void DisplayPrivate()
	{
		System.out.println(weight);
	}
}
public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		System.out.println(customer.age);
		System.out.println(customer.size);
		customer.DisplayPrivate();

	}

}
