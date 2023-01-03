package funWithAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Result {

    /*
     * Complete the 'funWithAnagrams' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY text as parameter.
     */

    public static List<String> funWithAnagrams(List<String> text) {
    // Write your code here
    
        LinkedHashMap <String,String> texthash = new LinkedHashMap<>();
        List <String> keylist = new ArrayList<>();
        
        for (int i = 0; i < text.size(); i++) {
            char[] letters = text.get(i).toCharArray();
            Arrays.sort(letters);
            String textstr = new String(letters);
            
            if (!keylist.contains(textstr)) {
                keylist.add(textstr);   
                texthash.put(textstr, text.get(i));             
            }    
        }
        
        List<String> resultlist = new ArrayList<>();
        
        for (Map.Entry<String,String> textlist : texthash.entrySet()) {
            resultlist.add(textlist.getValue());
        }
        
        Collections.sort(resultlist);
        return resultlist;
        
    }
}
    
      /*  LinkedHashMap <String,Integer> texthash = new LinkedHashMap<>();
                
        for (int i = 0; i < text.size(); i++) {
            char[] letters = text.get(i).toCharArray();
            Arrays.sort(letters);
            String textstr = new String(letters);
            texthash.put(textstr, text.size()-i -1);            
        }
        
        for (int j = text.size()-1; j >=0; j--)     {            
            if (texthash.containsValue(j) == false)
                text.remove(j);          
        }
        
        Collections.sort(text);          
        return text;
    }
} */