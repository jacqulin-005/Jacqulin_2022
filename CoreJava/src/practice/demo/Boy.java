package practice.demo;

class Boy extends Human{
	   static void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       Human obj = new Boy();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       Human obj2 = new Human();
	       
	       Boy obj3 = new Boy();
	       obj.walk();
	       obj2.walk();
	       obj3.walk();
	   }
	}