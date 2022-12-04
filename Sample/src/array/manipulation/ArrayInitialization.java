package array.manipulation;
import java.util.*;

public class ArrayInitialization {

	public static void main(String[] args) {
		int n;
	       Scanner input = new Scanner(System.in);
	        System.out.print("Enter the size of the array from 1 to 100: ");
	        n = input.nextInt();
	        int [] array = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for(int i = 0; i < n; i++) {
	            array[i] = input.nextInt();
	        }
	        System.out.println("Array elements are: ");
	        System.out.println(Arrays.toString(array));
	        for(int i = 0; i < n; i++) {
	            System.out.print(array[i] + "\t");
	        }

	}

}
