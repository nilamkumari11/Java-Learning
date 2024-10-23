package com.nilam;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);     //no such thing like next.inChar
        /*
        here next prints the whole word
        trim removes the extra spaces
        char at 0 gives the first letter
         */
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper Case");

        }    }
}
