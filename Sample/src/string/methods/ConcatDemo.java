package string.methods;

class ConcatDemo {

	public static void main(String[] args) {
		String str1 = "Learn ";
		String str2 = "Java";
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));
		
		String str3 = "hello";
		String str4 = "learners";
		String str5 = str3 + str4;
		System.out.println(str5);
		
		String message = "Welcome " + "to " + "Java";
		String s       = "Chapter" + 2;
		String s1      = "Supplement" + 'B';
		System.out.println(message);
		System.out.println(s);
		System.out.println(s1);

	}

}
