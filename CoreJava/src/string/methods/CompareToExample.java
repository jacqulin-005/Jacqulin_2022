package string.methods;

public class CompareToExample {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hemlo";
		String s4 = "flag";
		String s5 = "fast";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		System.out.println(s4.compareTo(s5));

	}

}
