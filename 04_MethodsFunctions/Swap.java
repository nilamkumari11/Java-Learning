package com.nilam;

import java.sql.SQLOutput;

public class Swap {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        //swap numbers
//        int temp = a ;
//        a = b ;
//        b = temp;

        swap(a, b);    //it is not swaping the numbers

        System.out.println(a + " " + b);

        String name = "Nilam Kumari"; // name is pointing to nilam
        changeName(name);      //the name is not changed to ayu roy
        System.out.println(name); //name is still pointing to nilam and printed nilam
    }

    private static void changeName(String naam) { //naam is copy of name pointing to nilam
        naam = "Ayushi Roy"; //now naam a new object is created pointing to ayushi (but this didnt changed name )
    }
/*
PRIMITIVES : int, short, char, byte -> just passing value
             (two objects are created inheap memory and two different are pointing to each)
OBJECTS AND STUFF : passig value of the reference variable
                    (name and naam pointing to same object -> change is made in one its refelected in another)
 */
    static void swap(int a, int b){ //these are primtive
        int temp = a ;  // here a and b are swaped in this method
        a = b ;  // but this is not reflected in the main function
        b = temp;  // as value of a and b originally is not changed

        // here any thing changed in this function will only be valid in this scope only
    }
}
