
import java.util.ArrayList;
import java.util.List;

public class CountVowels {

    public static void main(String[] args) {
        String str1  = "the kiran academy";
        String str2  = "java is programming language";
        String str3  = "spring is framework";
        String str4  = "jpa is api";
        String str5  = "hibernate is orm tool";

        
        String[] strings = {str1, str2, str3, str4, str5};
         String vowels = "aeiouAEIOU";

        for (int i = 0; i < strings.length; i++) {
            List<Character> foundVowels = new ArrayList<>();

            for (char ch : strings[i].toCharArray()) {
                if (vowels.indexOf(ch) != -1 && !foundVowels.contains(ch)) {
                    foundVowels.add(ch);
                }
            }

            System.out.println("String " + (i + 1) + " has "  + foundVowels.size() + " vowels " + foundVowels);
        }
    }
    
}
