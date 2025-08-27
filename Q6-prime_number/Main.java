// Write a Java program to check if a given number is prime or not.
public class Main {
   
    public static void main(String[] args) {
    
        boolean isPrime = checkPrime(2);
        // boolean isPrime = checkPrime(3);
        // boolean isPrime = checkPrime(11);
        // boolean isPrime = checkPrime(26);

        if(isPrime){
            System.out.println("The Given Number is Prime NUmber");
        }else{
            System.out.println("The Given Number is Not a Prime NUmber");

        }
        
    }

    public static boolean checkPrime(int num){
        if(num < 2) return false;

        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return  false;
            }
        }
        return true;
    }

    
}
