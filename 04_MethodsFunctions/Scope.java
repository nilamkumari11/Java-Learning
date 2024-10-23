package com.nilam;

public class Scope {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        String name = "Nilam";
//        System.out.println(num); // num cant be accssed here

        {
//            int a = 30 ; // already initialised outside tthe block int the same method
            //hence can't be initialised again, only value can be changed
            a = 30; // reassign the original refernce variable to some other value
            int c = 78;
            name = "Ayushi";
            System.out.println(name); //print ayushi
        }
        /*
        2. BLOCK SCOPE
        values initialised in the block will remain in the block
         */
//        System.out.println(c); //can't be used outside the block

        System.out.println(a); //output will be 30

        System.out.println(name);  //print ayushi

        /*
    3. SCOPING IN FOR LOOPS
    -> whatever values are already defined in the scope of the function of the for loop or block
    They can't be initialised again
    -> Any thing initialised inside can't be used outside
     */

        for(int i = 0; i < 4; i++){
            System.out.println(i);
//            int a = 12; // its giving error because
        }
    }

    static void random(int marks){ // marks has scope in this function
        int num = 67 ;
        System.out.println(num); //num can be accessed here
    /*
    1. FUNCTION SCOPE
    if a variable is defined in a function it can only be accessed in that function
     */
    }

}
