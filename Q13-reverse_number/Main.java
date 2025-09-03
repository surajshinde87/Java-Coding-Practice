// Write a Java program to find the reverse of a number without converting it into a string.

public class Main {

    public static void main(String[] args) {
        int number = 12345; 
        int reversedNumber = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int num){
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
}
