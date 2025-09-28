// Check if the number is SPY number or not

public class Main {

    public static void main(String[] args) {
        
        int num = 421, temp = num;           // 1124 spy, 421 not spy
        
        int sum = 0;
        int mul = 1;

        while (temp > 0) {
            int digit =  temp % 10;
            sum += digit;
            mul *= digit;
            temp /= 10;
        }

        if (sum == mul) {
            System.out.println(num + " is SPY Number");
        }else{
            System.out.println(num + " is Not SPY Number");

        }

    }
    
}