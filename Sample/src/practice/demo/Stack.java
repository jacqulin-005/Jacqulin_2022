package practice.demo;

public class Stack {
	
	int s1[] = new int[5];
	int tos1 = 0;
	char s2[] = new char[5];
	int tos2 = 0;
	
	Stack() {
		tos1 = -1;
		tos2 = -1;
	}

	void push1(int item) {
		if (tos1 == 4)
			System.out.println("Stack1 is Full");
		else {
			s1[++tos1] = item;
			System.out.println("Stack1 pushed element: " + item);
		}
	}
	
	int pop1() {
		if (tos1 >= 0)
			return s1[tos1--];
		else 
			return -1;
	}
	
	void push2(char item) {
		if (tos2 == 4)
			System.out.println("Stack2 is Full");
		else {
			s2[++tos2] = item;
			System.out.println("Stack2 pushed element: " + item);
		}
	}
	
	char pop2() {
		if (tos2 >= 0)
			return s2[tos2--];
		else 
			return '-';
	}
}
