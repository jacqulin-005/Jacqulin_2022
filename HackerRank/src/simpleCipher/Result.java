package simpleCipher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Result {

    /*
     * Complete the 'simpleCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING encrypted
     *  2. INTEGER k
     */

    public static String simpleCipher(String encrypted, int k) {
    // Write your code here
    
        String decrypted = "";
        k %= 26;
        HashMap<String,Integer> cipher = new HashMap<>();
                    
        cipher.put("A",0);
        cipher.put("B",1);
        cipher.put("C",2);
        cipher.put("D",3);
        cipher.put("E",4);
        cipher.put("F",5);
        cipher.put("G",6);
        cipher.put("H",7);
        cipher.put("I",8);
        cipher.put("J",9);
        cipher.put("K",10);
        cipher.put("L",11);
        cipher.put("M",12);
        cipher.put("N",13);
        cipher.put("O",14);
        cipher.put("P",15);
        cipher.put("Q",16);
        cipher.put("R",17);
        cipher.put("S",18);
        cipher.put("T",19);
        cipher.put("U",20);
        cipher.put("V",21);
        cipher.put("W",22);
        cipher.put("X",23);
        cipher.put("Y",24);
        cipher.put("Z",25);
        
        Set<Map.Entry<String, Integer> > entrySet = cipher.entrySet();
 
        List<Map.Entry<String, Integer> > entryList = new ArrayList<>(entrySet);
     
        for (int i = 0; i < encrypted.length(); i++) {
            
            int idx = cipher.get(String.valueOf(encrypted.charAt(i)));
            idx -= k;
            if(idx < 0)
                idx += 26;
                
            decrypted = decrypted + entryList.get(idx).getKey();
        }
        return decrypted;
    }
}

    //Two hidden test cases time limit exceeds for this code
    
    /*    String cipher = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String decrypted = "";
        k = k % 26;
        for (int i = 0; i < encrypted.length(); i++) {
            int idx = cipher.indexOf(encrypted.charAt(i));
            idx -= k;
            if (idx < 0)
                idx += 26;
            decrypted = decrypted + cipher.charAt(idx);
        }
        return decrypted;
    }
    
} */

