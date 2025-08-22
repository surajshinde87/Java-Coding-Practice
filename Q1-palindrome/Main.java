
//  Write a Java program to check if a given string is a palindrome.  
// Ignore spaces, punctuation, and case sensitivity.

public class Main {
    public static void main(String args[]) {

        String str = "A man, a plan, a canal: Panama";  // output: Palindrome
        // String str = "i like java";   output: Not a Palindrome


        // First Method
          for( char c : str.toCharArray()){
              if(!Character.isLetterOrDigit(c)){
                  str = str.replace(String.valueOf(c), "");
              }
          }

          str = str.toLowerCase();
          String revStr = "";

          for(int i = str.length() - 1; i >= 0; i--){
              revStr += str.charAt(i);
          }
          if(str.equals(revStr)){
              System.out.println("Palindrome");
            }else{
              System.out.println("Not a Palindrome");
            }
          

        // Second Method
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();

        if(str.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(rev.replaceAll("[^a-zA-Z0-9]", ""))){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }



    }

}
