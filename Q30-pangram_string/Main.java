// Check if a string is a pangram
// A pangram is a sentence that contains every letter of the alphabet at least once.
public class Main {

    public static void main(String[] args) {
       
        String str = "The quick brown fox jumps over the lazy dog";  // true
        // String str = "Hello World";    // false

        System.out.println(isPangram(str) ? "Pangram" : "Not a Pangram");

    }
    public static boolean isPangram(String str){
        str = str.toLowerCase();
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(str.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }

    // other approach using streams
    public static boolean isPangramStream(String str){
        return str.toLowerCase().chars()
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;
    }
}
