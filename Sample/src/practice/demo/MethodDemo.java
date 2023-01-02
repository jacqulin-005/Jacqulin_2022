package practice.demo;

public class MethodDemo {
	
	//Printing Message in a box
	static void printMsg() {
		System.out.println("  ___________________________");
		System.out.println(" |                           |");
		System.out.println(" | Welcome to Finding Digits |");
		System.out.println(" |___________________________|");
		System.out.println(" ");
	}
	
	//Finding sum of Digits
	int num;
	int count = 0;
	int temp = 0;
	
	int sumOfDigits() {
					
		while (num != 0) {
			temp = num % 10;
			num /= 10;
			count += temp;
		}
		return count;		
	}	
	//Finding two digit number
	boolean bool = false;
	
	boolean findTwoDigit() {
		
		while (num != 0) {
			num /=10;
			++count;
		}
		if (count == 2)
			return true;
		else
			return bool;
		
	}

	public static void main(String[] args) {
		
		printMsg();
		
		MethodDemo Method1 = new MethodDemo(); 
		Method1.num = 234;
		Method1.sumOfDigits();
		System.out.println("Sum of Digits in the number 234 is: " + Method1.sumOfDigits() );
		
		MethodDemo Method2 = new MethodDemo(); 
		Method2.num = 9582;
		Method2.sumOfDigits();
		System.out.println("Sum of Digits in the number 9582 is: " + Method2.sumOfDigits() );
		
		MethodDemo Method3 = new MethodDemo(); 
		Method3.num = 1548943000;
		Method3.sumOfDigits();
		System.out.println("Sum of Digits in the number 1548943000 is: " + Method3.sumOfDigits() );
		
		System.out.println(" ");
		
		MethodDemo Method4 = new MethodDemo(); 
		Method4.num = 234;
		Method4.findTwoDigit();
		System.out.println("234 is a two digit number: " + Method4.findTwoDigit() );
		
		MethodDemo Method5 = new MethodDemo(); 
		Method5.num = 23;
		Method5.findTwoDigit();
		System.out.println("23 is a two digit number: " + Method5.findTwoDigit() );		
		
		MethodDemo Method6 = new MethodDemo(); 
		Method6.num = 1234567890;
		Method6.findTwoDigit();
		System.out.println("1234567890 is a two digit number: " + Method6.findTwoDigit() );		
	}

}
