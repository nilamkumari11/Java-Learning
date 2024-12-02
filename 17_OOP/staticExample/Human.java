package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // same for all humans
    // when a member is declared static, it can be accessed before any object of the class is being created, without referencing to that object

    static void message() {
        System.out.println("Hello world");
//        this.age -> this represents object, cant be used
    }

    //constructor
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // to access static variables we use the class name
        // we don't use this because it is same for all objects (convention is class name)
        // it will check whether it exists in the object, it's not, it is static variable, existing in class template

        this.message();
    }
    // those properties which are not directly related to the object are static variables

}
