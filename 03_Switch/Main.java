package com.nilam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
//        if(fruit == "mango"){
//            /*
//            it checks the refrence values
//             */
//        }
//        if(fruit.equals("mango")){
//            /*
//            it only checks the value
//             */
//        }         // this will be very long process we use switch

        switch (fruit) {
            case "Mango":
                System.out.println("KIng of fruits");
                break;
            case "Apple":
                System.out.println("Sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small green fruits");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }
            //this is enhanced switch where we have break after each line
        int day = sc.nextInt();
        switch(day){
            case 1 ->
            {
                System.out.println("Monday");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("there are only seven days in a week");
        }

        // If we dont want to use break in som conditions
               //OLD STYLE
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("there are only seven days in a week");
                break;
        }

                     //ENHANCED STYLE
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("there are only seven days in a week");
        }
    }
}
