package string.methods;

import java.util.Scanner;

public class substring {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		int count = s.length() - k + 1;
		String[] substr = new String[count];
		for (int i = 0; i < count; i++) {
			substr[i] = s.substring(i, k);
			k++;
		}
		String temp;
		int i = 0;
		while (i < substr.length) {
			int j = i + 1;
			while (j < substr.length) {
				if (substr[j].compareTo(substr[i]) < 0) {
					temp = substr[i];
					substr[i] = substr[j];
					substr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		
		smallest = substr[0];
		largest = substr[substr.length - 1];
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));

	}

}
