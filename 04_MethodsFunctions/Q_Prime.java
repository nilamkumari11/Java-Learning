package com.nilam;

import java.util.Scanner;

public class Q_Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while(c*c < num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        if(c*c > num){
            return true;
        }
        return false;
    }
}
