package Methods;

public class AddMethod {
	
	static int myMethod(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		        
		int num1 = 25;
		int num2 = 15;

		AddMethod obj = new AddMethod();
	
		int result = myMethod(num1, num2);
		System.out.println("Sum is: " + result);

	}

}
