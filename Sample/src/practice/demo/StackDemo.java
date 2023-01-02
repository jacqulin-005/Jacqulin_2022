package practice.demo;

public class StackDemo {

	public static void main(String[] args) {
		Stack st1 = new Stack();
		Stack st2 = new Stack();
			
		st1.push1(4);
		st1.push1(3);
		st1.push1(8);
		st1.push1(10);
		st1.push1(5);
		st1.push1(2);
		
		while (st1.tos1 != -1) { 
			System.out.println("Stack1 popped element: " + st1.pop1());		
		}		
		System.out.println("Stack1 is Empty");
		
		st2.push2('A');
		st2.push2('j');
		st2.push2('/');
		st2.push2('2');
		st2.push2('$');
		st2.push2('e');
		
		while (st2.tos2 != -1) { 
			System.out.println("Stack2 popped element: " + st2.pop2());		
		}		
		System.out.println("Stack2 is Empty");
	}

}
