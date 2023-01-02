package exceptions;

import java.io.*;

class ThrowableExample {

    // Main Method
    public static void main(String[] args)
        throws Exception
    {
        try {
            testException();
        }

        catch (Throwable e) {

            // Print using tostring()
            System.out.println("Exception: "
                            + e.toString());
        }
    }

    // Method which throws Exception
    public static void testException()
        throws Exception
    {
    	// Code added
    	throw new Exception(
                "Throwable Exception");
    }
}
