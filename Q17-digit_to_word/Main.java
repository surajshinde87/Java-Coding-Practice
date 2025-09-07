// Accept the number from user and convert it into words.

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Number in words: ");
        convertToWords(num);

        scanner.close();

    }

    public static void convertToWords(int num){

        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0'; 
            System.out.print(arr[digit] + " ");
        }
    }

    

}
