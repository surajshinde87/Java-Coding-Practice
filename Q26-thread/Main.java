// Create two thread one for a to j and another for 20 to 30  one takes 2 seconds to execute and another takes 3 seconds

public class Main extends Thread {
    public static void main(String[] args) {

        Main t1 = new Main(){
            public void run(){
               for(char ch = 'a'; ch <= 'j'; ch++){
        
                try{
                    Thread.sleep(1000);
                    System.out.println(ch);
                }catch(InterruptedException e){
                    System.out.println(e);
                 
               }
            }
        }
     
    };
        Main t2 = new Main(){
            public void run(){
               for(int i = 20; i <= 30; i++){
        
                try{
                    Thread.sleep(1000);
                    System.out.println(i);
                }catch(InterruptedException e){
                    System.out.println(e);
                 
               }
            }
        }

    };
        t1.start(); 
        t2.start();



    }
}