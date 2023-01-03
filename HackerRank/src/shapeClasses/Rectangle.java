package shapeClasses;

class Rectangle {
    float width;
    float height;
    
    Rectangle(float w, float h) {
        width = w;
        height = h;
    }   
    
    int getArea() {        
        double areaRtemp = Math.ceil(width * height);
        int areaR = (int)areaRtemp;
        return areaR;        
        }
}