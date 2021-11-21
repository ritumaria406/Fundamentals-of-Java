package com.greatlearning.corejava;


public class PrintDetails { // This is a class

void copyMe() {

System.out.println("Inside copy me method");

}


public static void main(String[] args) {

// your code here...
PrintDetails obj = new PrintDetails();
obj.copyMe();
}

}