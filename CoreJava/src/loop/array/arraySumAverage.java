package loop.array;

public class arraySumAverage {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		int sum = 0;
		Double average;
		
		for (int number: numbers) {
			sum += number;
		}
			   
		int arrayLength = numbers.length;
		average =  ((double)sum / (double)arrayLength);
			   
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
			   
		}

}
