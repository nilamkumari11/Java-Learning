package com.nilam;

public class Shadowing {
    //SHADOWING DOESN'T WORKS IN METHOD
   static int x = 90; // this will be shadowed at line 8
   public static void main(String[] args) {
       System.out.println(x); //90
       int x;
//       System.out.println(x); // scope begins when value is initialised

       x = 40 ; // class variable at line 4 will be shadowed by this
       System.out.println(x); //40
       fun(); //90
   }

   static void fun(){
       System.out.println(x); //here x = 40 is only avalaible for main block so here x = 90 value will be taken
   }
}
