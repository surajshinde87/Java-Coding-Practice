// Swap two numbers without using a third variable

public class Main {
 
    public static void main(String[] args) {
        int a = 87;
        int b = 67;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping without a third variable
        a = a + b; 
        b = a - b; 
        a = a - b; 
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
     
}
