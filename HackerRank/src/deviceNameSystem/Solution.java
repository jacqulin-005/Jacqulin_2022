package deviceNameSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int devicenamesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> devicenames = IntStream.range(0, devicenamesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.deviceNamesSystem(devicenames);
        System.out.println(result);

        /*bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        ); */

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

