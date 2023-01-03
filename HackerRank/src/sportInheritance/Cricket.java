package sportInheritance;

class Cricket {                 
    int[] playerIDs = new int[12];
    String sport = "cricket";
Cricket() {   
    for(int i = 1; i <= 11 ; i++) 
        playerIDs[i] = 1;   
}
        
public void calculateAvgAge(int[] age) {
            
    double avgAge = 0; 
    double temp = 0;  
    for(int i = 0; i< 11; i++) {
         temp += age[i];  
    } 
    avgAge = temp / 11;
    System.out.println("The average age of the team is " + String.format("%.2f", avgAge));
    
}

public void retirePlayer(int id) {
    if (playerIDs[id] == -1)
        System.out.println("Player has already retired"); 
    else { 
        playerIDs[id] = -1;
        System.out.println("Player with id: " + id + " has retired");
    }
    
}
}