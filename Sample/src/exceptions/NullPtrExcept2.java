package exceptions;
import java.io.*;

class NullPtrExcept2
{
    public static void main (String[] args)
    {
        // String s set an empty string and calling getLength()
        String s = "";
        
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // String s set to a value and calling getLength()
        s = "GeeksforGeeks";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // Setting s as null and calling getLength()
        s = null;
        try
        {
            System.out.println(getLength(s));
            
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
            
        }
    }
    // Code added
	private static int getLength(String s) {
		int x;
		if (s == null) 
			throw new IllegalArgumentException("Null Argument");
		else
			x = s.length();
			return x;
	}
}
