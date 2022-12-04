package string.methods;

public class ContainExample {

	public static void main(String[] args) {
		String s1 = "Learn Java";
		Boolean result;
		
		result = s1.contains("Java");
		System.out.println(result);
		result = s1.contains("java");
		System.out.println(result);
		result = s1.contains("Python");
		System.out.println(result);
		result = s1.contains("");
		System.out.println(result);
		
	}

}
