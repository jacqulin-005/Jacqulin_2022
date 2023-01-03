package duplicatedProducts;

import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'numDuplicates' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY name
     *  2. INTEGER_ARRAY price
     *  3. INTEGER_ARRAY weight
     */

    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
    // Write your code here
        int duplicate = 0;
        int count = 0;
        String tempname = "";
        
        for ( int i = 0; i < name.size(); i++) {                        
            tempname = name.get(i) + " " + price.get(i)+ " " + weight.get(i);
            name.set(count, tempname);
            count++;            
        }
        Collections.sort(name);
        
        for (int i = 1; i < name.size(); i++) {
            if (name.get(i-1).equals(name.get(i)))
                duplicate++;
        }        
        return duplicate;
    }
}