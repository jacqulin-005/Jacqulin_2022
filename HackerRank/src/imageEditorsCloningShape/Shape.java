package imageEditorsCloningShape;

class Shape {
    String type;
    String color;
     
    Shape (String type, String color) {
        this.type = type;
        this.color = color;
    }
     
    String getType() {
        return type;
    }
     
    void setType(String type) {
        this.type = type;
    }
    
    String getColor() {
        return color;
    }
    
    void setColor(String color)  {
        this.color = color;
    }
    
    Shape cloneShape() {
        Shape shape = new Shape(type,color);
        return shape;            
    }
 }
