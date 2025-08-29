//Write a Java program to find the largest element in an array.


public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 44};
        int largest = findLargestElement(arr);
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargestElement(int[] arr){
        int largestElem = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElem) {
                largestElem = arr[i];
                
            }
        }
        return largestElem;
    }

    
}
