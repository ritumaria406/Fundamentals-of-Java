package com.greatlearning.corejava;
class ThreeDimensionShape
{
	double width,height,depth;
	ThreeDimensionShape(){
		width = 0;
		height =0;
		depth =0;
	}
	ThreeDimensionShape(double length){
		width = length;
		height =length;
		depth =length;
	}
	ThreeDimensionShape(double widthValue,double heightValue,double depthValue){
		width = widthValue;
		height =heightValue;
		depth =depthValue;
	}
	
	
	double volume () {
		return width * height * depth;
	}
}
public class ThreeDimensionShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeDimensionShape t1 = new ThreeDimensionShape();
		ThreeDimensionShape t2 = new ThreeDimensionShape(10);
		ThreeDimensionShape t3 = new ThreeDimensionShape(10,20,10);
		
		System.out.println(t1.volume());
		System.out.println(t2.volume());
		System.out.println(t3.volume());

	}

}
