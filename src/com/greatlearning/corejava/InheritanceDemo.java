package com.greatlearning.corejava;

class InheritanceA{	
	float area;
	void circleArea(int radius)
	{
		 area = 3.14f * radius * radius;
		 
		 System.out.println("Area of circle "+area);
	}
}

class InheritanceB extends InheritanceA{	
	
	void rectangleArea (int length, int breath)
	{
		 area = length * breath;
		 System.out.println("Area of rectangle "+area);
	}
}

class InheritanceC extends InheritanceB{	
	
	void triangleArea (int height, int breadth)
	{
		 area = (height * breadth)/2;
		 System.out.println("Area of traingle "+area);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceC obj = new InheritanceC();
		obj.circleArea(10);
		obj.rectangleArea(10,20);
		obj.triangleArea(10,20);

	}

}
