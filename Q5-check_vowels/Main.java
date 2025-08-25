//Write a Java program that takes a string as input and counts the number of vowels (a, e, i, o, u) in it.

public class Main {

    public static void main(String[] args) {

    String str = "JAVA is Programming Language";

    String vowels = "aeiou";
    
    str = str.toLowerCase();

  int vowelCount = 0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        // vowelCount++; 
        // }
        // secound approach
         if (vowels.indexOf(ch) != -1) {
        vowelCount++; 
        }
    }

    System.out.println("Vowel Count " + vowelCount);

    }


    
}