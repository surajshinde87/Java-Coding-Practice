// Write a Java program to check whether two strings are rotations of each other.
public class Main {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        String concatenated = str1 + str1;

        if (str1.length() == str2.length() && concatenated.contains(str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
            
        }
        

    }
}
