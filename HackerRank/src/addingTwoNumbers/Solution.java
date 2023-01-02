package addingTwoNumbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        float a = Float.parseFloat(bufferedReader.readLine().trim());

        float b = Float.parseFloat(bufferedReader.readLine().trim());

        int result = Result.addNumbers(a, b);

        System.out.println(String.valueOf(result));
        
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}