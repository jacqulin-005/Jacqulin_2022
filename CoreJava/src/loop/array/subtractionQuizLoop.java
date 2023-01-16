package loop.array;
import java.util.*;

public class subtractionQuizLoop {

	public static void main(String[] args) {
		
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		int counter = 0;
		String output = "";
		Scanner input = new Scanner(System.in);
		
		while (( counter < NUMBER_OF_QUESTIONS)) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
			
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
				
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
			if ((number1 - number2) == answer ) {
				System.out.println("You are correct");
				correctCount++;
			}
			 else {
				System.out.println("Your answer is wrong. " + number1 + " - " + number2 + 
							" should be " + (number1 - number2));
				count++;
			 }
			counter++;
			}
			System.out.println("Number of correct answers: " + correctCount);
			System.out.println("Number of wrong answers:" + count);
		
	
	}
}
