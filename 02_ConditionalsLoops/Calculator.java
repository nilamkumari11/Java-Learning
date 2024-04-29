package com.nilam;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0 ;
        while(true){
            System.out.println("Enter ur operator");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two numbers");
                int a = input.nextInt();
                int b = input.nextInt();

                if(op == '+'){
                    ans = a + b ;
                }
                if(op == '-'){
                    ans = a - b;
                }
                if(op == '*'){
                    ans = a * b ;
                }
                if(op == '/'){
                    if(b != 0){
                        ans = a/b ;
                    }else{
                        System.out.println("cant divide by zero");
                    }
                }
                if(op == '%'){
                    if(b != 0){
                        ans = a % b ;
                    }else{
                        System.out.println("cant divide by zero");
                    }
                }
            }else if(op == 'x' || op == 'X'){
                break ;
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
