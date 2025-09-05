// Write a Java program to find the sum of digits of a given number.
public class Main {
    public static void main(String[] args) {
        int num = 9474;
        int sum = 0;
        int original = num;
        int digits = String.valueOf(num).length();
        
        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        if(sum == original){
            System.out.println("The given number is armstrong number.");
        }else{
            System.out.println("The given number is not armstrong number.");
        }
    }
    
}
