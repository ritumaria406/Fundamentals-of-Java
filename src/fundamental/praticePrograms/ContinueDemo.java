package fundamental.praticePrograms;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=2;  ; i++) {
				
				if(i%2 != 0)					
					continue;
			
				System.out.println(i);
				
				if (i >= 20)
					break;
			}
	}

}
