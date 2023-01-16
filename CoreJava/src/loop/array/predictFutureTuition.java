package loop.array;

public class predictFutureTuition {

	public static void main(String[] args) {
		
		double i = 10000;
		int j = 0;
		while (i <= 20000) {
			i *= 1.07;
			j++;			
		}		
		System.out.println("The tuition will be double in " + j + " years");	
	}

}
