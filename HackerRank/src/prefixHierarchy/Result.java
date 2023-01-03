package prefixHierarchy;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'findCompletePrefixes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY names
     *  2. STRING_ARRAY query
     */

    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
    // Write your code here
        List <Integer> prefix = new ArrayList<Integer>();  
        for (int i = 0; i < query.size(); i++) {
            int count = 0;  
            String temp = query.get(i);
            int x = temp.length();
            
            for (int j = 0; j < names.size(); j++) {
                if (names.get(j).length() > x)
                    if ((names.get(j).subSequence(0, x).equals(temp)) && (!names.get(j).equals(temp))) 
                        count++;
            }  
            prefix.add(count);              
        }
        return prefix;
    }

}
