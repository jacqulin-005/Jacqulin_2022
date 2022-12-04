package loop.array;
import java.util.*;

public class greatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter N1: ");
		int n1 = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter N2: ");
		int n2 = input1.nextInt();

		int k =2;
		int x = 0;
		
		while ((k <= n1) || (k <= n2)) {
			if ((n1 % k == 0) && (n2 % k == 0)) {
				x = k;
			}
		k++;	
			
		}
		System.out.println("The Greatest Common Factor: " +x );
	}

}
