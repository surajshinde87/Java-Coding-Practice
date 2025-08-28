// Write a Java program to calculate the factorial of a given number n.

public class Main {

    public static void main(String[] args) {
        
         int num = 5;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(num);
            System.out.println("Factorial of " + num + " is: " + fact);
        }
        

    }

    public static int factorial(int num){

        if (num == 0 || num == 1)return 1;

        return num * factorial( num - 1);
    }
    
}