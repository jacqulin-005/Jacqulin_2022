package taskQueue;

import java.util.List;

class Result {

    /*
     * Complete the 'minTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY batchSize
     *  2. INTEGER_ARRAY processingTime
     *  3. INTEGER_ARRAY numTasks
     */

    public static long minTime(List<Integer> batchSize, List<Integer> processingTime, List<Integer> numTasks) {
    // Write your code here
    
        long sum = 0;
        for (int i = 0; i < batchSize.size(); i++) {
             long x = numTasks.get(i) / batchSize.get(i);
                if ((numTasks.get(i) % batchSize.get(i)) != 0) { 
                    x += 1; 
                }
                long time = processingTime.get(i) * x;
                if (sum < time) {
                    sum = time;
                }
        }    
        return sum;
    }
}