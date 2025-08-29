// Write a Java program to check whether a given number is a palindrome or not.

public class Main {

    public static void main(String[] args) {
        // int num = 123;
        int num = 121;

        boolean isPalindrome = checkPalindrome(num);
        if(isPalindrome){
            System.out.println("The Given Number " + num + " is Palindrome");
        }else{
            System.out.println("The Given Number " + num + " is Not a Palindrome");

        }
    }
    
    public static boolean checkPalindrome(int num){
        int originalNum = num , reversedNum = 0;

        while (num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
            
        }
        return originalNum == reversedNum;
    }
}
