package com.nilam;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = in.nextInt();
        System.out.println("Enter the digit to be counted");
        int a = in.nextInt();
        int orgnum = num ;
        int count = 0 ;
        int rem = 1;
        while(num>0){
            rem = num % 10 ;
            if(rem == a){
                count++;
            }
            num = num / 10;
        }
        System.out.println("total number of " + a + " in " + orgnum + " are " + count);

    }
}
