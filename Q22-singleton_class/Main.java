// Implement Singleton Class in Java
class Singleton {
    // create object at the time of class loading
    private static final Singleton instance = new Singleton();

    // private constructor (prevents instantiation)
    private Singleton() {}

    // global access point
    public static Singleton getInstance() {
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true (same object)
    }
}
