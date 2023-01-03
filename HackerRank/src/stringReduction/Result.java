package stringReduction;

class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinDeletions(String s) {
    // Write your code here
        
        int reduce = 0;
        String temp = String.valueOf(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            
                if (temp.contains(String.valueOf(ch))) {
                    reduce++; 
                }
                else {
                    temp = temp + ch;
                }                                                                 
        }        
                return reduce;                
    }

}