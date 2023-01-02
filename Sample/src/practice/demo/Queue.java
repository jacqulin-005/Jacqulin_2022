package practice.demo;

public class Queue {
	int qu1[] = new int[5];
	int toq1 = 0;
	int boq1 =0;
	char qu2[] = new char[5];	
	int toq2 = 0;
	int boq2 = 0;
	
	Queue() {
		toq1 = -1;
		boq1 = -1;
		toq2 = -1;
		boq2 = -1;
	}
	
	void enqueue1(int item) {
		if (toq1 == 4)
			System.out.println("Queue1 is Full");
		else {
			qu1[++toq1] = item;
			System.out.println("Queue1 enqueued element: " + item);
		}		
	}
	
	int dequeue1() {
		if (boq1 == 4)
			return -1;
		else
			return qu1[++boq1];
	}

	void enqueue2(char item) {
		if (toq2 == 4)
			System.out.println("Queue2 is Full");
		else {
			qu2[++toq2] = item;
			System.out.println("Queue1 enqueued element: " + item);
		}		
	}

	char dequeue2() {
		if (boq2 == 4)
			return '-';
		else
			return qu2[++boq2];
	}
}