package string.methods;

import java.util.Scanner;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.

		String[] split1 = s.trim().split("[' '?!_,@.]+[' '?!_,@.]*");
		if (s.trim().isEmpty())
            System.out.println(0);
        else
            System.out.println(split1.length);
		for (String n : split1) {
			System.out.println(n);
		}
		scan.close();

	}

}
