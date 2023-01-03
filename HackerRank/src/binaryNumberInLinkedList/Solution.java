package binaryNumberInLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList binary = new SinglyLinkedList();

        int binaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, binaryCount).forEach(i -> {
            try {
                int binaryItem = Integer.parseInt(bufferedReader.readLine().trim());

                binary.insertNode(binaryItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }); 

        long result = Result.getNumber(binary.head);
        System.out.println(String.valueOf(result));

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
