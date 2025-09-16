
import java.util.Scanner;
// Write a program that takes a string as input from the user. From this string, form two new words:
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string the Word");
        String str = sc.next();

        String firstWord = "";
        String secondWord = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                firstWord += str.charAt(i);
            } else {
                secondWord += str.charAt(i);
            }
        }
        System.out.println("First word is " + firstWord);
        System.out.println("Second word is " + secondWord);


        // Second way
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                first.append(str.charAt(i));
            } else {
                second.append(str.charAt(i));
            }
        }
        System.out.println("First word is " + first);
        System.out.println("Second word is " + second);

        // Third way
        String firstW = "";
        String secondW = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                firstW += chars[i];
            } else {
                secondW += chars[i];
            }
        }
        System.out.println("First word is " + firstW);
        System.out.println("Second word is " + secondW);
        

        
    }
}
