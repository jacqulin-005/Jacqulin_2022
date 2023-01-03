package primeOrNot;

class Result {

    /*
     * Complete the 'isPrime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int isPrime(long n) {
    // Write your code here
    
        long x = 0;
        long d = 2;
        for (long i = 2; i < n; i++) {
            x = n % d;
                if ((x == 0) || (n < 4)) 
                   break; 
                else 
                    d++;                                   
        } 
            if ((x == 0) && (n > 3)) {
                int p = (int)d;
                return p;
            }
            else 
                return 1;
    }

}