package com.greatlearning.corejava;

class Method{
	int performleftShift () {
		int i =10;
		return i<<1;
	}
	void performRightShift(int val, int digitstoshift) {
		int result =val>>digitstoshift;
		System.out.println("performRightShift " + result);
	}
}


public class LeftShiftRightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Method obj = new Method();
			System.out.println("performRightShift " + obj.performleftShift());
			obj.performRightShift(20,1);
			
	}

}
