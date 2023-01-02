package practice.demo;

import java.util.HashMap;

public class hashGetorDefault {
	
	public static void main(String[] args)
    {
  
        // Create a HashMap and add some values
        HashMap<Integer, Integer> map
            = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
  
        // print map details
        System.out.println("HashMap: "
                           + map.toString());
  
        // provide key whose value has to be obtained
        // and default value for the key. Store the
        // return value in k
        int k = map.getOrDefault(5, 500);
  
        // print the value of k returned by
        // getOrDefault(Object key, V defaultValue) method
        System.out.println("Returned Value: " + k);
    }

}
