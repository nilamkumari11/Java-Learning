package com.nilam;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      // int ans = sum2();     //fuction call
        //System.out.println(ans);

        int ans = sum3(20,30);  // a replaced by 20 and b by 30
        System.out.println(ans);  // int return type tha isliye wps se value deke print kiye

    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b ){
        int sum = a + b ;
        return sum;
    }


    // return the value
    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first number :");
        num1 = input.nextInt();
        System.out.println("Enter second number :");
        num2 = input.nextInt();
        sum = num1 + num2 ;
        return sum;  // return is used then the function ends

        // System.out.println("this will not execute"); //its an unreachable statement
    }
    static void sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first number :");
        num1 = input.nextInt();
        System.out.println("Enter second number :");
        num2 = input.nextInt();
        sum = num1 + num2 ;
        System.out.println("The sum is " + sum);
    }
    /*

    access modifier(we'll look in OOPS) return_type name (arguments){
        //body
        return statement ;
    }
     */
}
