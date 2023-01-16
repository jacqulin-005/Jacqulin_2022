package practice.demo;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		q1.enqueue1(3);
		q1.enqueue1(5);
		q1.enqueue1(2);
		q1.enqueue1(9);
		q1.enqueue1(7);
		q1.enqueue1(6);
		
		while (q1.boq1 < 4) {
			System.out.println("Queue1 dequeued elememt: " + q1.dequeue1());
		}
		System.out.println("Queue1 is Empty");
		
		q2.enqueue2('F');
		q2.enqueue2('r');
		q2.enqueue2('?');
		q2.enqueue2('!');
		q2.enqueue2('+');
		q2.enqueue2('z');
		
		while (q2.boq2 < 4) {
			System.out.println("Queue1 dequeued elememt: " + q2.dequeue2());
		}
		System.out.println("Queue1 is Empty");
	}
}
