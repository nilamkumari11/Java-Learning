package com.nilam;

import java.util.Arrays;

public class VarArgs { //when we don't know how many inputs we are giving
    public static void main(String[] args) {
        fun(2,3,4,5,6,78,9,65); //internally stored in an ARRAY
          multiple(2, 3, "Kunal" , "Nilam" , "Ayushi");
          demo(2,4,6);
          demo("Nilam","Ayushi","Nitu");
//          demo(); //this will give an error
        //it is know as Ambiguous method call bechause
        //-> the vararg parameter cant be empty here as it will not be able to decide which one to take
    }

    // when we want to have mix of arguments normal arguments as well as keyword arguments
    static void multiple(int a, int b, String ...v){

    }

//    static void multiple(int a, String ...v , int b ){}   //Vararg parameter must be last in list
    //-> because how will I know when to start for b because v can have any number of arguments
    static void fun(int ...v){ //when we dont kow how many int we will pass we will write ...name
        //Internally it takes it as an array of integers

        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){

    }
}
