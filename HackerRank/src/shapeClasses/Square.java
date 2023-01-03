package shapeClasses;

class Square {
    float width;
    
    Square(float w) {
        width = w;
    } 
       
    int getArea() {                   
        double areaStemp = Math.ceil(width * width);
        int areaS = (int)areaStemp;
        return areaS;        
        }
}