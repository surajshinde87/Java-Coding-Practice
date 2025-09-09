// Write a Java program to sort the elements of a HashMap by their values.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Add elements to the map
        map.put("Banana", 2);
        map.put("Apple", 1);
        map.put("Mango", 3);

        // Convert map entries into a list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list by values
        Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        // Print sorted entries
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
    
}
