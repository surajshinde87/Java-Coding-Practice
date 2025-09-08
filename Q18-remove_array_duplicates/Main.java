
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 5, 4, 6, 8};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int num : set){
            System.out.print(num + " ");
        }


    }
       

}
