package com.nilam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q. Take input of two numbers and print the sum
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first number :");
        num1 = input.nextInt();
        System.out.println("Enter second number :");
        num2 = input.nextInt();
        sum = num1 + num2 ;
        System.out.println("The sum is " + sum);
    }
}
