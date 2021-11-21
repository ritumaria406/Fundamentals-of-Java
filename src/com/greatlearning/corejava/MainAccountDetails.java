package com.greatlearning.corejava;

 class Account {
	String customerName;
	int accountNo;
	
	Account(String a, int b)
	{
		this.customerName = a;
		this.accountNo = b;
	}
	void display()
	{
		System.out.println("Display customerName "+customerName +" account number " + accountNo);
	}
}
 
 class CurrentAccount  extends Account {
	 int currentBalance;
	 
	 CurrentAccount(String a, int b, int c)
	 {
		super(a,b);
		this.currentBalance = c;
		 
	 }
	 void display()
		{
			System.out.println("Display customerName "+super.customerName +" account number " + super.accountNo +"CurrentBalance " + currentBalance);
		}
 }

 class AccountDetails   extends CurrentAccount {
	 int depositAmount,withdrawalAmount ;
	 
     AccountDetails(String a, int b, int c, int d, int e)
	 {
		super(a,b,c);
		this.currentBalance = c;
		 
	 }
	 void display()
		{
		 System.out.println("Display customerName "+super.customerName +" account number " + super.accountNo +" CurrentBalance " + super.currentBalance
				 +"depositAmount " +depositAmount+ "withdrawalAmount "+withdrawalAmount);
		}
 }


public class MainAccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails obj = new AccountDetails("Ritu",11221212,10000,5000,1000);
		obj.display();

	}

}
