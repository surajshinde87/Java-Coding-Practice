// Write a Java program to find the second largest element in an array without sorting it.

public class Main {
    
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 99};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num >firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            }else if(num > secondLargest && num != firstLargest){
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element.");
        }else{
            System.out.println("The second largest element is: " + secondLargest);      
        }
    }

}
