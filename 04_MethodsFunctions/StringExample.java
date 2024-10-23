package com.nilam;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = in.next();  //i myself entered the name
        String personalized = myGreet(name);    //clicking on myGreet without creating method Alt + enter will
        //automatically create a new function myGreet
        System.out.println(personalized);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name ;
        return message ;   //return type string h isliye main me wps alg se input leke run kiye
    }

    static String greet(){
        //return 23 ; // it will give error as return type is string but this is int
        String greeting = "How are you ?";
        return greeting;
    }
}
