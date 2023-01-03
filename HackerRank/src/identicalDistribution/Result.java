package identicalDistribution;

import java.util.List;

class Result {

    /*
     * Complete the 'cardPackets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY cardTypes as parameter.
     */

    public static int cardPackets(List<Integer> cardTypes) {
    // Write your code here
        int second = 0;
        int third = 0;
        int fifth = 0;
        for (int i = 0; i < cardTypes.size(); i++) {
            second += cardTypes.get(i) % 2;
            third += cardTypes.get(i) % 3;  
            fifth += cardTypes.get(i) % 5;  
        }
        if (second < third && second < fifth)
            return second;
        else
            if (third < second && third < fifth)
            return third;
        else 
            return fifth;
    }
}