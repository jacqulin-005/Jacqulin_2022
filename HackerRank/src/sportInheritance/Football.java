package sportInheritance;

class Football extends Cricket implements Sport {
    
    Football() {
        System.out.println("A new cricket team has been formed");                  
        System.out.println("A new football team has been formed");  
    }
            
    void playerTransfer(int fee, int id) {
        if (playerIDs[id] == 1)
            System.out.println("Player with id: " + id + 
                " has been transferred with a fee of "+ fee);
        else
            System.out.println("Player has already retired");
    }
}
