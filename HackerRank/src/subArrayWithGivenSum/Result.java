package subArrayWithGivenSum;

import java.util.HashMap;
import java.util.List;

class Result {

    /*
     * Complete the 'countNumberOfSubarrays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static long countNumberOfSubarrays(List<Integer> arr, int k) {
    // Write your code here
    
        long count = 0;
        int sum = 0;      
        HashMap <Integer,Integer> prevSum = new HashMap<>();
        prevSum.put(0, 1);
        
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        
            if(prevSum.containsKey(sum - k ))
                count += prevSum.get(sum - k);
                
            prevSum.put(sum, prevSum.getOrDefault(sum, 0) + 1);
        } 
        
        return count; 
    }          
}        
    
    // Testcase 11 to 14 time limit exceeds for this code
            
    /*    long count = 0;
        for(int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = i; j < arr.size(); j++)  {
                sum += arr.get(j);
                if (sum == k) {
                    count++;  
                }
            }
        }
        return count; 
    }
} */
