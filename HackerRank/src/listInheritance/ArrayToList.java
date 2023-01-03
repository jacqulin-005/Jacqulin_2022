package listInheritance;

import java.util.ArrayList;
import java.util.List;

class ArrayToList implements MyList {
    
    List <String> arr;
        
    public ArrayToList() {
        arr = new ArrayList<>();
    }
    
    public void convert(String[] a) {
        arr.clear();
        for (int i = 0; i < a.length; i++)  {
            arr.add(a[i]); 
            System.out.println("I have added the string: " + a[i] + " at the index: " + i);
        }            
    }
    
    public void replace(int idx) {               
        System.out.println("I have replaced the string: " + arr.get(idx) + " with a null string");
        arr.set(idx, "");
    }
    
    public ArrayList<String> compact() {
        ArrayList <String> arrlist = new ArrayList<>();
        for (String str : this.arr) {
            if (!str.equals(""))
             arrlist.add(str);
        }
        return arrlist;
    }
}
