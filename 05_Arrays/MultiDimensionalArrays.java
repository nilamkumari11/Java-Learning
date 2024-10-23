package nilam;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][];//number of columns is not mandatory to specify but reverse is not ture
        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3}, //oth index
//                {4,5,6,0},//1st index
//                {7,8,9} //2nd index -> arr[2] = {7,8,9}
//        };//number of columns is not neccesary to be same
//        System.out.println(Arrays.toString(arr));

        //in C and C++ 2D arrays are also continuous memory allocation
        //2D ARRAYS are a collection of ARRAYS
        // we can't imagine after 3D arrays in java consider python then

        //input
        int[][] arr = new int[3][2];
        System.out.println(arr.length);//-> no. of rows
        for(int row = 0 ; row < arr.length ; row++){
            for (int col = 0 ; col < arr[row].length ; col++){ //as col number is varrying
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for(int row = 0 ; row < arr.length ; row++){
            for (int col = 0 ; col < arr[row].length ; col++){ //as col number is varrying
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        //output 2
        for(int row = 0 ; row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        //enhanced for loop -> same as 1D array
        for(int[] a : arr){ //taking array
            System.out.println(Arrays.toString(a)); //print with brakets comma
        }
    }
}
