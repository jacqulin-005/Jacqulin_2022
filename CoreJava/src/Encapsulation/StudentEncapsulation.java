package Encapsulation;

public class StudentEncapsulation {

	public static void main(String[] args) {

		Student h1 = new Student();
		h1.setStudentid("A1234");
		h1.setFname("Jacqulin");
		h1.setLname("Sheeba");
		h1.setEmail("jacqulin_sheeba@gmail.com");
		h1.setPhone(1234567890);
			
		System.out.println("Student Id: " + h1.getStudentid());
		System.out.println("First Name: " + h1.getFname());
		System.out.println("Last Name: " + h1.getLname());
		System.out.println("Student Email: " + h1.getEmail());
		System.out.println("Student Phone: " + h1.getPhone());
		
		}
}
