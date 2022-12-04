package string.methods;

public class ReplaceExample {

	public static void main(String[] args) {
		String s1 = "abc cba";
		System.out.println(s1.replace('a', 'z'));
		System.out.println("Lava".replace('L', 'J'));
		System.out.println("Hello".replace('4', 'J'));
		System.out.println(s1.replace("C++", "Java"));
		System.out.println("aa bb aa zz".replace("aa", "zz"));
		System.out.println("Java".replace("C++", "C"));

	}

}
