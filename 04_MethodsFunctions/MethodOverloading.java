package com.nilam;

public class MethodOverloading {
    public static void main(String[] args) {
        // two or more functions of same name can exist if the parameters are different
        fun(67); //when calling with int it will call first fun auto
        fun("Nilam"); //calling with String it will give it name value
        /*how this is knowing which fun to call when
        -> thats known as function OVERLOADING aruments are different
        -> This is done at the time of compilation
         */
        int ans = sum(3 , 4);
        System.out.println(ans);
        ans = sum(3,4,3);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a + b ;
    }

    static int sum(int a,int b, int c){
        return a + b + c ;
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}
