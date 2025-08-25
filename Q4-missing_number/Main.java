// You are given an array of size n that contains numbers from 1 to n+1 with exactly one number missing.
//  Write a Java program to find the missing number

public class Main {
    
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 4, 5}; 
        int n = arr.length;

        int expectedSum = (n + 1) * (n + 2) / 2;
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }

    

}
