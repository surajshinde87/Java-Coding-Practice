// Write a Java program to count the frequency of each element in an array.

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int n = arr.length;

        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    visited[j] = true;
                }
            }
        }

        System.out.println("Element Frequency");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
    }
}
