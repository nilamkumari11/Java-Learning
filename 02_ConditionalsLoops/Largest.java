package com.nilam;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers that are to be compared");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }if(c > max){
//            max = c;
//        }

//        int max = 0;
//        if (a > b){
//            max = a;
//        }else{
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

        int max = Math.max(c,Math.max(a,b));
        System.out.println("Maximum number is " + max);



    }
}
