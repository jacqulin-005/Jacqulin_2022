package practiceIf;

import java.util.StringJoiner;

public class Strjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1 = new StringJoiner(":", "{", "}");
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		sj1.add("Name").add("Tony");
		sj2.add("LastName").add("Strak");
		System.out.println(sj1.merge(sj2).toString());

	}

}
