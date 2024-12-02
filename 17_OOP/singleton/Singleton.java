package singleton;

public class Singleton {
    // one obj(instance) is allowed

    private int num= 0;

    // private -> only used in this class
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
    // check whether only 1 obj only is created or not
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
