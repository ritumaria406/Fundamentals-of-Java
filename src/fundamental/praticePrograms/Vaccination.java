package fundamental.praticePrograms;

public class Vaccination {

	static int count;
	String name;
	
	public Vaccination() {
		count ++;
	}
	
	void setVaccinationName(String name)
	{
		this.name = name;
	}
	
	String getVaccinationName() {
		return name;
	}
	
	void numberOfVaccines()
	{		
		System.out.println(count);
	}
}

