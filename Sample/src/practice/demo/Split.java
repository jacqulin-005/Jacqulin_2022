package practice.demo;

public class Split {

	public static void main(String[] args) {
		String input = "Bread$$##12.5$$##10";
		String[] str = input.split("\\$\\$##");
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		Double price = Double.valueOf(str[1]);
		System.out.println(price);
		Integer quantity = Integer.valueOf(str[2]);
		System.out.println(quantity);
	}

}
