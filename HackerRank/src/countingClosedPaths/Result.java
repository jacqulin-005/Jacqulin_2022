package countingClosedPaths;

class Result {

    /*
     * Complete the 'closedPaths' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int closedPaths(int number) {
    // Write your code here
        
        int count = 0;
        int x = 0; 
        
        while (number != 0) { 
            x = number % 10;  
            number = number / 10;           
                if (x == 8) {
                    count += 2; 
                    continue;
                }     
                if ((x == 0) || (x == 4) || (x == 6) || (x == 9)) 
                    count += 1;                                  
        }                
        return count;
    }
}
