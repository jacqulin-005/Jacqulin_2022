package array.manipulation;
import java.util.*;

public class arraysCopy {

	public static void main(String[] args) {
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Arrays.sort(numbers);
		System.out.println(numbers);
		 
		char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
		Arrays.sort(chars);
		System.out.println(chars);
		
	    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
	    Arrays.sort(arr);
	    System.out.printf("Modified arr[] : %s",  Arrays.toString(arr));
	    	
	    int[] sourceArrays = {2,3,4,5,10};
	    int[] targetArrays = new int[sourceArrays.length];
	    for(int i =0; i < sourceArrays.length; i++)
	    {
	       targetArrays[i] = sourceArrays[i];
	    }
	    System.out.println(Arrays.toString(sourceArrays));
	    System.out.println(Arrays.toString(targetArrays));
	    System.out.println(sourceArrays);
	    System.out.println(targetArrays);
	    if (targetArrays == sourceArrays) {
	       System.out.println("Same instance");
	    } else {
	       System.out.println("Different instance");
	    }

	    int[] sourceArray = {1,2,3};
	    int[] targetArray = sourceArray.clone();
	    System.out.println(sourceArray);
	    System.out.println(targetArray);
	    sourceArray[2] = 500;

	    System.out.println("Source Array: " + Arrays.toString(sourceArray));
	    System.out.println("Target Array: " + Arrays.toString(targetArray));
	    
	    System.arraycopy(sourceArray, 0, targetArray, 1, 2);
	    System.out.println("Target Array: " + Arrays.toString(targetArray));
	}

}
