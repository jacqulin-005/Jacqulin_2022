package jumpToTheFlag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int flagHeight = Integer.parseInt(bufferedReader.readLine().trim());

        int bigJump = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.jumps(flagHeight, bigJump);
        System.out.println(String.valueOf(result));

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
