// Write a Java program to find the sum of digits of a given number.

public class Main {
    
    public static void main(String[] args) {
        int number = 123456789; 
        int sumOfDigits = sumDigits(number);
        System.out.println("Number: " + number);
        System.out.println("Sum of Digits: " + sumOfDigits);
    }

    public static int sumDigits(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
