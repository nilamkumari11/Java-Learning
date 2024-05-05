package com.nilam;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Nilam Kumari"; // name is pointing towards object nilam in heap memory
        greet(name);  //when name is passed in this method the value of reference variable is passed
        /*
        in java there is nothing like PASSED BY REFERENCE
        it only has PASSED BY VALUE

        here name is a refrence variable, the copy of the value of the name is passed
        so naam(another reference vaiable) is a copy of name
        naam is also pointing towards the same object nilam
         */
    }

     static void greet(String naam) {  //here i wrote naam istead of name still its working
         System.out.println(naam);  //naam will take the value of name whatever name is given
    }
}
