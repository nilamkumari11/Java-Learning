package com.nilam;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empNo = input.nextInt();
        String demp = input.next();

        switch(empNo){
            case 1 :
                System.out.println("NILAM KUMARI");
                break;
            case 2 :
                System.out.println("Ayushi Roy");
                break;
            case 3 :
                switch(demp){
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Management"  :
                        System.out.println("Mangement dprtment");
                        break;
                    default :
                        System.out.println("No department");
                }
                break;
            default :
                System.out.println("Enter correct empNo");
        }

             //Enhanced Switch
        switch (empNo) {
            case 1 -> System.out.println("NILAM KUMARI");
            case 2 -> System.out.println("Ayushi Roy");
            case 3 -> {
                switch (demp) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Mangement dprtment");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct empNo");
        }
    }
}
