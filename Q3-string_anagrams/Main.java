// Write a Java program to check if two given strings are anagrams of each other.
public class Main {

public static void main(String[] args){

    String str1 = "silent";
    String str2 = "Listen";
      boolean anagram = isAnagram(str1, str2);

      if(anagram){
        System.out.println("The given strings are anagrams");
    }else{
          System.out.println("The given strings are not anagrams");

      }
    
    
}
public static boolean isAnagram(String str1, String str2){

    if(str1.length() != str2.length()) return false;

     int[] counts = new int[26];

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    for (int i = 0; i < str1.length(); i++) {
        counts[str1.charAt(i) - 'a']++;
        counts[str2.charAt(i) - 'a']--;
    }

    for (int count : counts) {
        if (count != 0) return false;
    }

    return true;
}
    
}
