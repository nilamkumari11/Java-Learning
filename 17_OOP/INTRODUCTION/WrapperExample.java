package INTRODUCTION;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10; // primitive
        int b = 20;
        Integer num = 45; // object -> with properties
        Integer num2 = 55;

        swap(a, b);
        System.out.println(a + " " + b); // it will not swap
        // In java, in primitives, there is nothing like pass by reference, everything is pass by value

        // when we pass objects it's reference value os passed
        swap2(num, num2);
        System.out.println(num + " " + num2); // not swapping

        //Integer class is final class
        // final is a keyword which prevents content to be modified
        // final keyword -> all are capital (convention)

//        final int BONUS = 2;
//        BONUS = 3; -> cant modified


        final A nilam = new A("Nilam Kumari");
        nilam.name = "Other name";

        // when a non primitive is final we can not re assign it
//        nilam = new A{"new Object"};

        A obj = new A("random");
        System.out.println(obj);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}



    class A {
//        final int num; -> not initialised, final variables need to be initialised
        // Always initialise while declaring
        // final guaranties this immutability, only when instance variables are primitive data types and not objects
        // because reference variable of a instance type has a final, the value of the instance variable will never change, reference to the object will never change
        // it will always refer to the same object, but the value of the object can change

        final int num = 10;
        String name;

        public A(String name) {
            this.name = name;
        }

//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("Object is destroyed");
//        }
        // In java, objects are removed from the heap memory by garbage collector
        // it does not allows us to do it manually(free the memory), in cpp it is destructor
        // it allows us to do something when it is removed by finalise, like show some msg
    }

