package lastAndSecondLast;

class Result {

    /*
     * Complete the 'lastLetters' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    public static String lastLetters(String word) {
    // Write your code here
        int x = word.length() - 2;
        String rev = "";
        for (int i = word.length() - 1; i >= x; i--) {
            rev = rev + word.charAt(i) + " ";
        }
        return rev;
    }

}
