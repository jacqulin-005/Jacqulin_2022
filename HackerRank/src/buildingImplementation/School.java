package buildingImplementation;

class School {
    int[] floors;
    int n;
    boolean hos = false;
    
    School(int n) {
        this.n = n;
        floors = new int[n+1];       
        for(int i = 1; i <= n; i ++)
            floors[i] = 0;
    }   
    
    public void floorCompleted(int floorNumber) {
        floors[0] = 1;        
        if (floorNumber <= n && floorNumber > 0)  {
            floors[floorNumber] = 1;
            if (hos == false)
                System.out.println("Construction for floor number " 
                    + floorNumber + " completed in school");
            else
                System.out.println("Construction for floor number " 
                    + floorNumber + " completed in hospital");
        }
        else        
        if (floorNumber > n || floorNumber <= 0)  {
            if (hos == false)
                System.out.println("Floor number " + floorNumber + " does not exist in school");
            else
                System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        }
    }
    
    public void printStatus(int floorNumber) {
        if (floorNumber > n || floorNumber <= 0) {
            if (hos == false)
                System.out.println("Floor number " + floorNumber + " does not exist in school");
            else
                System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        }  
        else
        if (floors[floorNumber] == 1 && floorNumber > 0) {
            if (hos == false)
                System.out.println("Construction for floor number " 
                    + floorNumber + " completed in school");
            else
                System.out.println("Construction for floor number " 
                    + floorNumber + " completed in hospital");
        }
        else 
        if (floors[floorNumber] == 0 && floorNumber > 0)  {
            if (hos == false)
                System.out.println("Construction for floor number " 
                    + floorNumber + " not completed in school");
            else
                System.out.println("Construction for floor number " 
                    + floorNumber + " not completed in hospital");
        }
    }
    
    public void printNumberOfFloors() {
        if (hos == false)
            System.out.println("The school has " + n + " floors");
        else
            System.out.println("The hospital has " + n + " floors");
    }
}
