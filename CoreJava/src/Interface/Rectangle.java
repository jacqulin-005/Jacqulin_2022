package Interface;

public class Rectangle implements Movable {
	   protected double radius;
	   private int x, y;   // x and y coordinates of the point

	   /** Constructs a MovablePoint instance at the given x and y */
	   public Rectangle(int x, int y) {
	       this.x = x;
	       this.y = y;
	   }

	   public String getCoordinate()
	   {
	     return  "(" + x + "," + y + ")";
	   }

	   // Need to implement all the abstract methods defined in the interface Movable
	   @Override
	   public void moveUp() {
	       y--;
	   }
	   @Override
	   public void moveDown() {
	       y++;
	   }
	   @Override
	   public void moveLeft() {
	       x--;
	   }
	   @Override
	   public void moveRight() {
	       x++;
	   }
	}

