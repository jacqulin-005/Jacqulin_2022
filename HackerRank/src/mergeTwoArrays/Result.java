package mergeTwoArrays;

import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'mergeArrays' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
    // Write your code here
        
        for(int i = 0; i < b.size(); i++) {
            a.add(b.get(i));
        }  
        Collections.sort(a);
        return a;   
    }

}
