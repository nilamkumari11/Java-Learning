package INTRODUCTION;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //store 5 roll numbers
        int[] num = new int[5];

        //store name of 5 students
        String[] names = new String[5];

        //data of 5 students (roll no., name , marks)
        // class: named group of properties and functions
        // class starts with Capital letter
        //create own data type with classes
        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students)); // initialise with null

        // class is template of an object ( logical construct)
        // object is instance of a class ( physical reality ) -> occupies space in memory

        // Objects have 3 essential properties
        // -> state of the object -> value from its data type
        // -> identity of object -> one object is different from other ( where value is stored )
        // -> behaviour of object -> effect of datatype operations

        // variables inside the objects are known as instance variables
        // dot operator links object reference variable with the instance variable

        Student nilam; //declaring reference to object -> just in stack memory
        // System.out.println(nilam.rno); -> error variable not initialised
        // to create objects use new keyword

        // new keyword -> dynamically allocates memory during runtime and returns a reference variable to it
        // why is new keyword not used for int, etc (primitives)
        // -> in java, primitive(stored in stack) datatypes are not implemented as objects(stored in heap)
        // for efficiency


        // variables and reference variables are stored in the stack, they point in the heap memory
        // In java student() gets memory allocated in heap memory and each variable is pointing to original object (in heap)
        // all class objects in java must be allocated dynamically
        // we cant access memory address, in java its not allowed
        // java safety, we can not manipulate references as we can in c or cpp

        // when we create a object of a class, ts being instantiated

        //initialisation
        nilam = new Student(37, "Nilam Kumari", 95.9f);

        // one line
        Student kunal = new Student();
//        System.out.println(kunal); // by default some random value
//        System.out.println(kunal.rno); // by default 0
//        System.out.println(kunal.name); // null
//        System.out.println(kunal.marks); // 90.0 ->by default 0.0

//        kunal.rno = 13;
//        kunal.name = "Kunal";
//        kunal.marks = 88.5f;
//
//        System.out.println(kunal.rno); // 13
//        System.out.println(kunal.name); // Kunal
//        System.out.println(kunal.marks); // 90.0
//        System.out.println(kunal.salary); // java is static type language (can be done in python)

        //constructor -> defines what happens when object is created
        // constructor is special function that runs when you create an object and it allocates some variables
        // by default constructor
        // when we construct it, it bind these arguments with the object

        kunal.changeName("Nilam");
        kunal.greeting();

        System.out.println(nilam.rno);
        System.out.println(nilam.name);
        System.out.println(nilam.marks);

        Student random =new Student(kunal);
        System.out.println(random.name);

        Student ayushi = new Student();
        System.out.println(ayushi.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something";
        System.out.println(two.name); // points to same object in heap memory
    }
}

    // create a class
    // for every single student
    class Student {
        int rno;
        String name;
        float marks = 90;

        // we need a way to add the values of the above properties object by object
        // we need one word to access every object -> this keyword

        void greeting() {
            System.out.println("Hello my name is " + name); // this is not req but it is taking it
        }

        void changeName(String newName) {
            name = newName;
        }

        Student (Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        //constructor
//        Student() { // no name required
//            this.rno = 13;
//            this.name = "Rahul";
//            this.marks = 65.7f;
//        }

        Student() {
            // this is how we call a constructor from another constructor
            // Internally : new Student(13, "Default person", 100);
            this(13, "Default person", 100);
        }

        Student(int rno, String naam, float marks) {
//            rno = roll; -> for different variable name it changes the value without this
            this.name = naam; // variable name can be different
            this.marks = marks; // it is good convention to use same variable names and use this, as it will get confused
            this.rno = rno;
        }
    }

