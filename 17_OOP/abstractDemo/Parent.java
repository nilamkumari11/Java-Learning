package abstractDemo;

public abstract class Parent {

    int age;

    final int VALUE ;

    public Parent(int age) {
        this.age = age;
        VALUE = 536590945;
    }

//    abstract Parent();
        // can not create abstract constructor

    // can we create abstract static methods
    // they can not be overridden
    // so there is no point

    // can create static methods in abstract classes
    static void hello() {
        System.out.println("this is a static method");
    }

    // abstract classes can contain normal methods
    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();

    // abstract classes need to be extended so that the methods can be overwritten
    // final prevents a class from inherited
    // so can not have final abstract class

    // Multiple Inheritence is not allowed, one class can not be extend from multiple classes
}
