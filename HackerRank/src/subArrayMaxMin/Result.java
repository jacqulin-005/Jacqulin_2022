package subArrayMaxMin;

import java.util.List;
import java.util.TreeMap;

class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */

    public static int maxMin(List<Integer> arr, int k) {
    // Write your code here  
        
        int arrmax = Integer.MIN_VALUE;
        TreeMap <Integer,Integer> arrsub = new TreeMap<>();
        
        int l = 0;
        for(int i = 0; i < arr.size(); i++) {
            
            l++;            
            arrsub.put(arr.get(i),arrsub.getOrDefault(arr.get(i), 0) + 1);
        
            if (l == k)  {
               int arrmin = arrsub.firstKey(); 
            
            arrsub.put(arr.get(i-k+1),arrsub.getOrDefault(arr.get(i-k+1),0) - 1);
            
            if (arrsub.get(arr.get(i-k+1)) == 0) {
                arrsub.remove(arr.get(i-k+1));
            }
            l--;
            
            if (arrmin > arrmax) 
                arrmax = arrmin;
            }            
        }    
        return arrmax;
    }
} 

    // Test case 12 time limit exceeds for this code   
     
    /*    int m = (arr.size() - k) + 1;
        int arrmax = Integer.MIN_VALUE;
        
        LinkedHashMap <Integer,Integer> arrsub = new LinkedHashMap<>();
        
        for (int i = 0; i < m; i++) {
            arrsub.put(i, Collections.min(arr.subList(i, i+k)));
            
            if (arrsub.get(i) > arrmax) {
                arrmax = arrsub.get(i);
            }
        }
        return arrmax;
    }
} */    
    
    // Test case 12 time limit exceeds for this code 
    
      /*  int m = (arr.size() - k) + 1;
        int arrmax = Integer.MIN_VALUE; 
        int subArrMin = 0;      
        
        for (int i = 0; i < m; i++) {   
            subArrMin = arr.get(i);
                                                          
            for (int j = i; j < i + k; j++) {    
                                          
                if (arr.get(j) < subArrMin)
                    subArrMin = arr.get(j);  
                               
            }           
            
        if (subArrMin > arrmax)
            arrmax = subArrMin;            
        }        
        return arrmax;
    }
} */
          
    // Test case 12 time limit exceeds for this code   
     /*   int m = (arr.size() - k) + 1;
        int arrmax = Integer.MIN_VALUE;
        int subArrMin = 0;
        
        for (int i = 0; i < m; i++) {
                    
            subArrMin = Collections.min(arr.subList(i, i+k));
            if (subArrMin > arrmax)
                arrmax = subArrMin;
            
        }            
        return arrmax;
    }
} */
    
    // Test cases 11 and 12 time limit exceeds for this code
    
       /* int m = (arr.size() - k) + 1;
        int arrmax = Integer.MIN_VALUE;
            
        List<Integer>[] arrsub = new ArrayList[m]; 
               
            for(int i = 0; i < m; i++) {
                arrsub[i] = new ArrayList<>(arr.subList(i, i+k));
                Collections.sort(arrsub[i]);
                
                if (arrsub[i].get(0) > arrmax) {
                    arrmax = arrsub[i].get(0);
                }
            }   
            
        return arrmax;
    }
} */