import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10, 50, 20, 90, 40, 60, 40, 50};

       IntStream unique = Arrays.stream(arr).distinct();
       unique.forEach(System.out::println);

    }
}
