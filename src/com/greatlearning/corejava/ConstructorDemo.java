package com.greatlearning.corejava;


class Constructor{
	Constructor()
	{
	System.out.println("I am a default constructor")	;
	}
	Constructor(int a,float b, String message,char value)
	{
	System.out.println("Parameterized Constrcutor square int and float " + a*b);
	System.out.println("Parameterized Constrcutor string " +message)	;
	System.out.println("Parameterized Constrcutor char value  " + value);
	}
}


//Class to access the class Constructor and invoke constructor
public class ConstructorDemo {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cust = new Constructor();
		Constructor cust1 = new Constructor(3,3.4f,"Hello",'a');
	}

}
