package nilam;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ARRAYS OF RPIMITIVES
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 45;
        arr[3] = 39;
        arr[4] = 98;
        System.out.println(arr[3]);

        //Input using loops
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Please enter " + (i+1) + " th term");
            arr[i] = in.nextInt();
        }
//        System.out.println("3rd index num is " + arr[3]);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        //for-each loop <-> enhanced for loop
        for (int j : arr) {
            System.out.print(j + " ");
        }

        //syntax of for-each loop
        //for(datatype reference_variable : array){}

        for (int num : arr){ //for every element in the array -> print element
            System.out.println(num); //here num reperesents elements in the array
        }

//        System.out.println(arr[5]); //index out of bound error

        //third method of input -> toString method
        System.out.println(Arrays.toString(arr));
        //internal for loops used -> adds brakets[] comma everything

        //ARRAYS OF OBJECTS
        String[] str = new String[4];
        for(int i = 0 ; i < str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //MODIFY
        str[1] = "NILU";
        System.out.println(Arrays.toString(str));
    }
}
