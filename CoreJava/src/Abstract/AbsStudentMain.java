package Abstract;
import java.util.*;

public class AbsStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   AbstractStudent student = new StudentService();
	       student.setUsername("Mike123");
	       student.setPassword("password1234567");
	       student.setRollnumber(0024);
	       student.displayinformation();

	       String[] name = {"Mike", "Gabriel"};
	       System.out.println(Arrays.toString(student.getFullName(name)));
	   }
	}
