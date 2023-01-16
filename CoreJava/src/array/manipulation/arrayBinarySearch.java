package array.manipulation;

import java.util.Arrays;

public class arrayBinarySearch {

	public static void main(String[] args) {
	
		String[] names = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
		System.out.println("Mary is at index: " + Arrays.binarySearch(names, "Mary"));
		
	}

}
