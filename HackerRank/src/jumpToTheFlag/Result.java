package jumpToTheFlag;

class Result {

    /*
     * Complete the 'jumps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER flagHeight
     *  2. INTEGER bigJump
     */

    public static int jumps(int flagHeight, int bigJump) {
    // Write your code here
        int x = flagHeight % bigJump;
        if (x == 0)
            return flagHeight / bigJump;
        else
            return ((flagHeight / bigJump) + x);  
    }

}