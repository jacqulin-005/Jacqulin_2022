package imageEditorsCloningShape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        
        int numberOfShapes = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfShapes-- > 0) {
            String[] shape = INPUT_READER.nextLine().split(" ");
            shapes.add(new Shape(shape[0], shape[1]));
        }
        
        int numberOfOperations = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfOperations-- > 0) {
            String[] operation = INPUT_READER.nextLine().split(" ");
            Shape shape = shapes.get(Integer.parseInt(operation[1]) - 1);
            
            if (operation[0].equals("CS")) {
                Shape clonedShape = shape.cloneShape();
                
                if (clonedShape == shape) {
                    shapes.add(new Shape("Bad-type", "No-color"));
                }
                
                shapes.add(clonedShape);
            } else if (operation[0].equals("UT")) {
                shape.setType(operation[2]);
            } else if (operation[0].equals("UC")) {
                shape.setColor(operation[2]);
            }
        }
        
        shapes.forEach((shape) -> {
            System.out.println(shape.getType() + " " + shape.getColor());
        });
    }
}