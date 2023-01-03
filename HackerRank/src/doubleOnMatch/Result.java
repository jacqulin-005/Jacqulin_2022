package doubleOnMatch;

import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'doubleSize' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY arr
     *  2. LONG_INTEGER b
     */

    public static long doubleSize(List<Long> arr, long b) {
    // Write your code here
            
            Collections.sort(arr);
            
            for(int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == b)
                    b *= 2;
            }
            
            return b;

    }

}
