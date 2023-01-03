package sumThemAll;

import java.util.List;

class Result {

    /*
     * Complete the 'arraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int arraySum(List<Integer> numbers) {
    // Write your code here
        int x = 0;
        for (Integer i : numbers) {
            x += i;  
        }
        return x;

    }

}