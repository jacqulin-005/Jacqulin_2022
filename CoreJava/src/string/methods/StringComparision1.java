package string.methods;

public class StringComparision1 {

	public static void main(String[] args) {

		String s1="PerScholas";
		String s2="PerScholas";
		String s3=new String("PerScholas");
		String s4=new String("PerScholas");
		String s5="Teksystem";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3)); 
		System.out.println(s3.equals(s4)); 
		System.out.println(s1.equals(s5));
			
	}

}
