package fundamental.praticePrograms;

public class FetchVaccinationDetails{
	
	public static void main(String[] args)
	{
		Vaccination pfizer = new Vaccination();
		pfizer.setVaccinationName("Pfizer BioTech");
		
		//Getting the Vaccination Name
		System.out.println(pfizer.getVaccinationName());
		pfizer.numberOfVaccines();
	}
}