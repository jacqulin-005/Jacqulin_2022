package studentEnrollment;

import java.util.Scanner;

public class Solution{
	 public static void main(String[] args){
	  
	  Scanner sc = new Scanner(System.in);
	  String[] names = sc.nextLine().split(" ");
	  int[][] marks = new int[names.length][3];

	  for(int i = 0; i < names.length; i++){
	   String[] temp = sc.nextLine().split(" ");
	   marks[i][0] = Integer.parseInt(temp[0]);
	   marks[i][1] = Integer.parseInt(temp[1]);
	   marks[i][2] = Integer.parseInt(temp[2]);	
	  }
	  String[] cla = sc.nextLine().split(" ");

	  Result r1 = new Result(marks[0][0], marks[0][1], marks[0][2],names[0], Integer.parseInt(cla[0]));
	  Result r2 = new Result(marks[1][0], marks[1][1], marks[1][2],names[1], Integer.parseInt(cla[1]));
	  Result r3 = new Result(marks[2][0], marks[2][1], marks[2][2],names[2], Integer.parseInt(cla[2]));
	  Result r4 = new Result(marks[3][0],marks[3][1], marks[3][2], names[3],Integer.parseInt(cla[3]));
	  Result r5 = new Result(marks[4][0], marks[4][1], marks[4][2], names[4], Integer.parseInt(cla[4]));
	  String sub = sc.nextLine();
	  int newMarks = Integer.parseInt(sc.nextLine());

	  System.out.println(r1.calculateResult());
	  System.out.println(r2.calculateResult());
	  System.out.println(r3.calculateResult());
	  System.out.println(r4.calculateResult());
	  System.out.println(r5.calculateResult());
	     
	  System.out.println(r1.changeMarks(newMarks,sub));
	  System.out.println(r3.changeMarks(newMarks,sub));
	  System.out.println(r5.changeMarks(newMarks,sub));
	 }	
	}
