package complianceCrawlerDictionary;

import java.util.List;

class Result {

    /*
     * Complete the 'minimumSteps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY loggedMoves as parameter.
     */

    public static int minimumSteps(List<String> loggedMoves) {
    // Write your code here
        int moves = 0;
        for(int i = 0; i < loggedMoves.size(); i++) {
            String temp = loggedMoves.get(i);
            if (!temp.equals("./")) {
                if (temp.equals("../")) {
                    moves -= 1;
                }
                else {
                    moves += 1;
                }
            }               
        }             
        return moves;
    }
}