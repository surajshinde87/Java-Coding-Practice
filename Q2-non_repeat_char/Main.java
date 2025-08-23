// Write a Java program to find the first non-repeating character in a string.
// If all characters repeat, return -1.

public class Main {
    public static void main(String[] args) {
        
        // String str = "javajava"; // output: -1
        String str = "swiss";  // output: 'w' at index
        int index = firstNonRepeatingChar(str);
        if(index != -1){
           System.out.println("First non-repeating character is '" + str.charAt(index) + "' at index " + index);
        }else{
           System.out.println(index);
        }

    }

    public static int firstNonRepeatingChar(String str){
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(str.indexOf(c) == str.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
}
