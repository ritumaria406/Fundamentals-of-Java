package com.algorithm.java;
import java.util.Scanner;

class LinearSearch {
	 
private static Scanner sc = new Scanner(System.in);
	
public int size;
public int[] arr;
int searchNumber;
public void implementationOfLinearSearch() {

	
insertValues();

printValues(); 

int val = searchValue(searchNumber);
if(val == -1)
{
	System.out.println("\n"+searchNumber+"not found in the array");
}
else
{
	System.out.println("\n"+"Found in the position "+val);
}
}

 

public void insertValues() {

// Your code here...
	System.out.println("Enter the size of the array");
	 size = sc.nextInt();
	 arr = new int[size];
	System.out.println("Enter the "+ size +" elements of the array");
	for(int i=0; i<size;i++)
	{
		arr[i]= sc.nextInt();
	}
	
	System.out.println("Enter the number to search in the array");
	searchNumber = sc.nextInt();
}

 

public void printValues() {

// Your code here...
	System.out.println("Array elements are : ");
	for(int i=0; i<size;i++)
	{
		System.out.print("    "+arr[i]);
	}

}

 

public int searchValue(int value) {

// Your code here...
	for(int i=0; i<size;i++)
	{
		if(arr[i] == value)
		return i;
	}
	return -1;

}
}
public class LinearSearchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinearSearch ln = new LinearSearch();
		ln.implementationOfLinearSearch();
	}

}
