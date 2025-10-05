
// Longest Substring Without Repeating Characters

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String str = "abcadbcbca";

        String longest = "";
        
        for (int i = 0; i < str.length(); i++) {
            HashSet<Character> set = new HashSet<>();    // for unique chars 
            StringBuilder current = new StringBuilder();

            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);

                if (set.contains(c)) {
                    break; // If Repeated character found break
                }

                set.add(c);
                current.append(c);
            }

            // Update longest substring if current one is longer than longest
            if (current.length() > longest.length()) {
                longest = current.toString();
            }
        }

        System.out.println("Longest substring without repeating characters: " + longest);
    }
}
