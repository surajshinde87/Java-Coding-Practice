import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
       int arr[] = {10, 50, 20, 90, 40, 60};

       Optional<Integer> secHighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();

       if (secHighest.isPresent()) {
        System.out.println("The Second Highest from the arr is " + secHighest.get());
       }else{
        System.out.println("There is no second no arr");
       }
    }
}
