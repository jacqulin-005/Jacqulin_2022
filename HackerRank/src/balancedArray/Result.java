package balancedArray;

import java.util.List;

class Result {

    /*
     * Complete the 'balancedSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int balancedSum(List<Integer> arr) {
    // Write your code here
        int pivot = 0;
        int sum1 = 0;
        int sum2 = 0;
        boolean found = false;
        int idx = arr.size() / 2;
                        
        for (int i = 0; i < idx; i++) {
            sum1 += arr.get(i);
        }
        
        for (int i = idx+1; i < arr.size(); i++) {
            sum2 += arr.get(i);
        }   
        
        if (sum1 == sum2) {
            pivot = idx;
            return pivot;
        }
            
        while (found = true) {
            if (sum1 < sum2) {
                sum1 += arr.get(idx);
                idx++;
                sum2 -= arr.get(idx);                 
            }   
            else     
            if (sum1 > sum2) {
                sum2 +=arr.get(idx);
                idx--;
                sum1 -= arr.get(idx);                    
            } 
            
            if (sum1 == sum2) {
                pivot = idx;
                found = true;
                break;
            }  
        }  
        return pivot;       
    }
}
