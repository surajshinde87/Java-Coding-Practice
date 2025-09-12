

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Create two array arraylist add keys in first arraylist and values in second add them in map and iterate that map
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add("Java");
        a2.add("Python");
        a2.add("JavaScript");

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < a1.size(); i++) {
            map.put(a1.get(i), a2.get(i));
        }
        
     
        Iterator<Integer> it = map.keySet().iterator();

        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
    
}
