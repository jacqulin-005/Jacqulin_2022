package shapeClasses;

class Circle {
    float radius;
    
    Circle(float r) {
        radius = r;
    }    
    
    int getArea() {
        double areaCtemp = Math.ceil(3.14159265 * radius * radius);
        int areaC = (int)areaCtemp;
        
        return areaC;
    }
}