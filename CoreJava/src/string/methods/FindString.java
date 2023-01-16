package string.methods;

public class FindString {

	public static void main(String[] args) {
		String s1 = "Java is fun";
		int result;
		result = s1.indexOf('s');
		System.out.println(result);
		result = s1.indexOf('J');
		System.out.println(result);
		result = s1.indexOf('j');
		System.out.println(result);
		result = s1.indexOf("Java");
		System.out.println(result);
		result = s1.indexOf("java");
		System.out.println(result);
		result = s1.indexOf('a');
		System.out.println(result);
		result = s1.lastIndexOf('a');
		System.out.println(result);
		result = s1.indexOf("ava");
		System.out.println(result);

	}

}
