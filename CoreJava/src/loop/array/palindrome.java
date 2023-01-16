package loop.array;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an input: ");
		
		original = input.nextLine();
		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse)) {
			System.out.println("Entered input is a palindrome");
		}
		else {
			System.out.println("Entered input is not a palindrome");
		}
			
	}

}
