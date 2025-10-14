// sort the array in ascending and descending order without using any inbuilt functions

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 6, 4, 7};

        // Sort in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
    
}
