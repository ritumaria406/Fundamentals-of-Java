package com.greatlearning.corejava;


class Health{
	protected int age;
	protected float weight;
	protected float bmi;
}
public class HealthDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Health health = new Health();
		health.age=23;
		health.weight=27;
		health.bmi = 20;
		
		System.out.println(health.age);
		System.out.println(health.weight);
		System.out.println(health.bmi);

	}

}
