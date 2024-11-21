package interfaces.extendDemo2;

public interface A {
    // static interface methods should always have a body
    // called via interface name
    static void greeting() {
        System.out.println("I am static method");
    }
    default  void fun() {
        System.out.println("i am in A");
    }
}
