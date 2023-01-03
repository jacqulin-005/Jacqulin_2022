package theRobotClass;

import java.util.Scanner;

public class RobotMoves {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = scan.nextInt();
		int y = scan.nextInt();
		int dx = scan.nextInt();
		int dy = scan.nextInt();
		
		Robot firstRobot = new Robot();
	    firstRobot.printCurrentCoordinates();
	    
	    Robot secondRobot = new Robot(x, y);
	    secondRobot.printCurrentCoordinates();
	    
	    for (int i = 1; i < 3; i++) {
	        secondRobot.moveX(dx);
	        secondRobot.printLastMove();
	        secondRobot.printCurrentCoordinates();
	        secondRobot.moveY(dy);
	        secondRobot.printLastCoordinates();

	        dx += i * i;
	        dy -= i * i;
	    }		
	}
}