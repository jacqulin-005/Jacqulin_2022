package minimumDifferenceSum;

import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'minDiff' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minDiff(List<Integer> arr) {
    // Write your code here
    
        int sum = 0; 
        
        Collections.sort(arr); 
        int temp1 = arr.get(0);
        
        for (int i = 1; i < arr.size(); i ++) {
            int temp2 = 0;
            temp2 = arr.get(i) - temp1;
            temp1 = arr.get(i);
            sum += temp2;                
        }
            
        return sum;
    }

}
