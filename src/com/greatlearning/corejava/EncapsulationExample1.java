package com.greatlearning.corejava;

class Encapsulation {
	private String  country, nationalAnthem , touristSpot;
	
	String getCounty()
	{
		return country;
	}
	String getnationalAnthem()
	{
		return nationalAnthem;
	}
	String gettouristSpot()
	{
		return touristSpot;
	}
	void setValue(String country,String nationalAnthem, String touristSpot) {
		this.country = country;
		this.nationalAnthem = nationalAnthem;
		this.touristSpot = touristSpot;
	}
}
public class EncapsulationExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation();
		obj.setValue("India", "Jana Gana Mana", "Taj Mahal");
		System.out.println("Country is "+obj.getCounty());
		System.out.println("National Anthem is "+obj.getnationalAnthem());
		System.out.println("Tourist Spot is "+obj.gettouristSpot());
		
	}

}
