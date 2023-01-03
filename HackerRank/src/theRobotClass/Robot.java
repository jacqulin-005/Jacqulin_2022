package theRobotClass;

class Robot {
    int currentX;
    int currentY;
    int previousX;
    int previousY;
    int vardx;
    
    Robot()  {  
        currentX = 0;
        currentY = 5;  
    }

    Robot(int x, int y) {
        this.currentX = x;
        this.currentY = y;
    }
    
    void moveX(int dx) {
        previousX = currentX;
        currentX = currentX + dx;
        previousY = currentY;
        vardx = dx;
    }
    
    void moveY(int dy) {        
        previousY = currentY;
        currentY = currentY + dy;
        previousX = currentX;
    }
    
    void printCurrentCoordinates() {
        System.out.println(currentX + " " + currentY);       
    }
     
    void printLastCoordinates() {        
        System.out.println(previousX + " " + previousY); 
    }
    
    void printLastMove() {
         System.out.println("x" + " " + vardx);                
    }
 }
 