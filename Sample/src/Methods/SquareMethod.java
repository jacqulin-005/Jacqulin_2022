package Methods;

public class SquareMethod {
	
	static int myMethod(int inputValue) {
		return inputValue * inputValue;
	}

	public static void main(String[] args) {

		int result;
        int inputValue=10;
        
		SquareMethod obj = new SquareMethod();
        result = myMethod(inputValue);

        System.out.println("Squared value  is: " + result);




	}

}
