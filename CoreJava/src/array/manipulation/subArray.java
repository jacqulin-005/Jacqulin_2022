package array.manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class subArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array from 1 to 100: ");
	    int counter = 0;
	    int n = input.nextInt();
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
	    	for (int i = 0; i < n; i++) {
	    		int sum = 0;
	    		
	            for (int j = i; j < n; j++) {
	                sum += array[j];
	                
	                if (sum < 0){
	                    counter++;
	                }
	            }
	        }
	        System.out.println("\n" + counter);
	}

}
