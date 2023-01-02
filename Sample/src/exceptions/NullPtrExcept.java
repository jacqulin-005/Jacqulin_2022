package exceptions;

import java.io.*;

class NullPtrExcept
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;
     // Code change starts
        if (ptr == null)
    		ptr = "";
    		System.out.println("ptr is null");
    	//  Code change ends

        try
        {        		
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
            
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}
