import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EvenNumbers {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9,0};
       
       // find even numbers
    //    IntStream arrStream = Arrays.stream(arr).filter(n -> n % 2 == 0);
    //    arrStream.forEach(System.out::println);

       // find the sum of even numbers
    //    int sum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();  
    //    System.out.println(sum);

    // find max value in arr
    // double avg = Arrays.stream(arr).average().orElse(0);
    // System.out.println("Average of arr : " + avg);
    
    // find all sum, avg, min, max in at one
    IntStream stream = Arrays.stream(arr);
    IntSummaryStatistics stats = stream.summaryStatistics();

    System.out.println("Sum of arr : " + stats.getSum());
    System.out.println("Average of arr : " + stats.getAverage());
    System.out.println("Min no of arr : " + stats.getMin());
    System.out.println("Max no of arr : " + stats.getMax());
    System.out.println("Count the number in arr : " + stats.getCount());

 

    }
}