package singleton;

import Access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all three reference variables are pointing to just one object

        A a = new A(23, "Nitu", 78, 89);
//        a.roll;  -> in different package not allowed
    }
}
