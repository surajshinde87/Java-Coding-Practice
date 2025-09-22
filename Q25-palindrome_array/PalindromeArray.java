// check if the given array is a palindrome or not

import java.util.Scanner;

public class PalindromeArray {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array");
        int size = sc.nextInt();
      int arr[] = new int[size];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    
        
        boolean isPalindrome = true;

        for(int i = 0; i < arr.length / 2; i++){
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome");
        } else {
            System.out.println("The array is not a palindrome");
        }

        sc.close();
    }
    
}
