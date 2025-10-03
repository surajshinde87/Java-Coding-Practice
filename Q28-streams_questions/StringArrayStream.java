import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayStream {
public static void main(String[] args) {
    
    String[] names = {"suraj", "dhiraj", "mahesh", "aditya", "rohit", "swaraj"};

    Stream<String> stream = Arrays.stream(names);

    // Filter names starting with "S"
    List<String> result = stream.filter(name -> name.startsWith("s")).collect(Collectors.toList());

    System.out.println(result);
    // Stream to capitalize first letter of each word

   List<String> cap = Arrays.stream(names).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
              .collect(Collectors.toList());

              System.out.println(cap);



}
    
}