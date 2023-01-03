package additionMagic;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class AdditionMagic{
    
    public String add(double a, String b) {
        return a + b;
    }
    
    public String add(double a, double b) {
                
        double d = a + b;
                
        String s1 = String.format("%.1f",d);
        if (s1.equals(String.valueOf(d)))
            return s1;
        else {
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.CEILING);
            return df.format(d);
        }    
         
    }
    
    public String add(String a, String b) {
        return a + b;
    }
        
}
