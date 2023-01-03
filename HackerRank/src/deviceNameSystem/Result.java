package deviceNameSystem;

import java.util.List;

class Result {

    /*
     * Complete the 'deviceNamesSystem' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY devicenames as parameter.
     */

    public static List<String> deviceNamesSystem(List<String> devicenames) {
    // Write your code here
        for (int i = 0; i < devicenames.size(); i++) {
            String temp = devicenames.get(i);
            int count = 0;
            
            for (int j = i+1; j < devicenames.size(); j++) {                                
                if (devicenames.get(j).equals(temp)) {
                    count++;
                    String append = devicenames.get(j) + count;
                    devicenames.set(j, append);
                }                    
            }                
        }                
        return devicenames;
    }
}
