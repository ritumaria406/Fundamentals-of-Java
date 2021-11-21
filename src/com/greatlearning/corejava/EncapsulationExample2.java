package com.greatlearning.corejava;

class EncapsulationImpl{
 private int age;
 private boolean decision;
 
 boolean getDecision()
   {
	 return decision;
   }
 
  int  getAge()
 {
	 return age;
 }
   
 void SetAge(int age) {
	 this.age = age;	 
}
 void SetDecision(boolean decision) {
	 this.decision = decision;	 
}
}
public class EncapsulationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationImpl obj = new EncapsulationImpl();
		obj.SetAge(12);	
		
		 if(obj.getAge() >= 18 && obj.getAge() <=65)
		 {
			 obj.SetDecision(true);
			 System.out.println("The age of the candidate is " +obj.getAge()+". Driving license can be issued to the candidate." +obj.getDecision());
		 }
		 else
		 {
			 obj.SetDecision(false);
			 System.out.println("The age of the candidate is " +obj.getAge()+". Driving license cannot be issued to the candidate." +obj.getDecision());
		 }

	}

}
