package twosPower;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    final static Scanner scan = new Scanner(System.in);
    final static String fileName = System.getenv("OUTPUT_PATH");
    

    /*
     * Write the regular expression in the blank space below
     */
    final static String regularExpression = "0*[1]0*";
    
    

    public static void main(String[] args) throws IOException {
        int query = Integer.parseInt(scan.nextLine());
        String[] result = new String[query];
        Arrays.fill(result, "False");
        
        for (int i = 0; i < query; i++) {
            String someString = scan.nextLine();
            
            if (someString.matches(regularExpression)) {
                result[i] = "True";
            }
        }
        
        //BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
        for (String res: result) {
        	System.out.println(res);
            //fileOut.write(res + "\n");
        }
        
        //fileOut.close();
    }
}