package com.nilam;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = in.nextInt();
        int orgnum = num ;
        int rev = 0;
        while(num > 0) {
            int rem = num % 10;
            num = num/10;
            rev = rev*10 + rem;
        }
        System.out.print("The rverse of " + orgnum + " is " + rev );
    }
}
