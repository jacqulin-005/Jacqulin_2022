package fourthBit;

class Result {

    /*
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
    // Write your code here
    
        String s;
        s = Integer.toBinaryString(number);
        int temp =  s.length() -  4;
        char fourth = s.charAt(temp);
        int i = Character.getNumericValue(fourth);
        return i;

    }

}
