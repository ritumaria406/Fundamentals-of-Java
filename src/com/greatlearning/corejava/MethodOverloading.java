package com.greatlearning.corejava;

 class MethodImpl{
	 void PrintMessage()
	 {
		 System.out.println("I am from method without return type");
	 }
	 void PrintMessage(String input)
	 {
		 System.out.println("I am from method without return type and a input argument");
	 }
	 String PrintMessage1()
	 {
		 return("I am from method with return type");
	 }
	 String PrintMessage1(String input)
	 {
		 return("I am from method with return type and a input argument");
	 }
	 
}



public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodImpl obj = new MethodImpl();
		obj.PrintMessage();
		obj.PrintMessage("a");
		System.out.println(obj.PrintMessage1());
		System.out.println(obj.PrintMessage1("a"));
	}

}
