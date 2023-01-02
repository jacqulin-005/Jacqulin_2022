package generics;

public class Printer {
	public <T> void printArray(T [] arr) {
		for(T t: arr) {
		System.out.println(t);
		}
	  }

}
