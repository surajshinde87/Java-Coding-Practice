// Write a Java program to print the Fibonacci series up to n terms, using both iteration and recursion.

public class Main {

    public static void main(String[] args) {
        int n = 10;
        printFibonacciRecursive(n);
        printFibonacciIterative(n);
    }

    // Iterative method to print Fibonacci series
    public static void printFibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series Iterative : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    
    // Recursive method to print Fibonacci series
    public static void printFibonacciRecursive(int n) {
        System.out.print("Fibonacci Series Recursive : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
