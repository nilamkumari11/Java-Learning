package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box  box = new Box();
        Box box2 = new Box(box);
        box.getL(); // its private but still accessed l
        // because we are not directly accessing we are accessing via method which is accessing it

        System.out.println(box.w + " " + box.h); // can only access variables from parent unless not private
        // this can not access weight (child class)

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box3.h + " " + box3.weight);

        Box box5 = new BoxWeight(2, 3, 4, 8); // reference of type Box, object of type BoxWeight
//        System.out.println(box5.weight); -> it is initialised but can't be accessed
        // it's the type of reference variable that determines which variables can be accessed

        // there are many variables in both parent and child classes
        // you are given access to variables that are in reference
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here the object itself is of parent class, how will you call the constructor of child class
        // that is why, error
//        BoxWeight box6 = new Box(1, 2, 3);
//        System.out.println(box6);


        BoxPrice box01 = new BoxPrice(2, 4, 800);

        // Types of inheritance

        box.greeting();

        BoxWeight box8 = new BoxWeight();
        box8.greeting();// can not override
        BoxWeight.greeting(); // you can inherit but canot override
    }
}
