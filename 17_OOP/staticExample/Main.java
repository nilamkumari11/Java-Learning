package staticExample;

public class Main {
    public static void main(String[] args) {
        Human nilam = new Human(18, "Nilam Kumari", 1000, false);
        Human ayushi = new Human(20, "Ayushi Roy", 5000, true);

        System.out.println(nilam.population); // not recommended
        System.out.println(Human.population); // by convention
        // when population was not static the output was 1, which was wrong

        // static belongs to the class, not to the object
        // psvm -> main is the first thing to be run, if main is not there program will not have run option
        // if it is not static then in order to run anything inside a class
        // we have to create an object of that class
        // how can we run the program to create an object if main the first thing running, hence we should be able to run main without creating an object of class main

//        greeting(); -> Error -> inside a static method can not use anything not static
        //static method can only access static data
        // anything non-static belongs to object, hence it is going to have an instance but static is not having an instance

        Main funn = new Main();
        funn.fun2();
    }

    //dependent on objects, belongs to an instance
    void greeting() {
        System.out.println("hello world");
        fun();
    }
    // this is not dependent on objects
    static void fun() {
//        greeting(); // we cant use this because it requires an instance
        // but the function you are using it in does not depend on objects

        // you can not access non-static stuff without referencing their instances in a static context

        //hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    // fun2 will be called in a static method (main) -> there object will be created
    void fun2() {
        greeting(); // here no need to create an obj
    }
}
