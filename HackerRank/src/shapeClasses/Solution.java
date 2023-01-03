package shapeClasses;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);        
        
        float radius = Float.parseFloat(sc.nextLine());
        Circle c1 = new Circle(radius);
      	System.out.println(c1.getArea());   
        
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        Rectangle r1 = new Rectangle(width, height);
      	System.out.println(r1.getArea());
      	sc.nextLine();
        
        radius = Float.parseFloat(sc.nextLine());
        Circle c2 = new Circle(radius);
      	System.out.println(c2.getArea());
    
        width = Float.parseFloat(sc.nextLine());
        Square s1 = new Square(width);
      	System.out.println(s1.getArea());
        
      	width = sc.nextFloat();
        height = sc.nextFloat();
        Rectangle r2 = new Rectangle(width, height);
      	System.out.println(r2.getArea());
        
        sc.close();
    }
}
