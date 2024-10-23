package nilam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxInArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter ur array:");
        for (int i = 0; i< 5; i++) {
            arr[i] = in.nextInt();
        }
//        int[] arr = {2,45,76,97,75,98};
        System.out.println(maxVal(arr));
        System.out.println("Enter range of comparision :");
        int st = in.nextInt();
        int en = in.nextInt();
        System.out.println(MaxRange(arr,st,en));
    }

    // work on edge cases here, like array being null ...
    static int maxVal(int[] arr){
        if(arr.length == 0){  //->edge case
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static int MaxRange(int[] arr , int start , int end){
        if(end>start){
            return -1; // -> edge case
        }

        if(arr ==null){
            return -1; // -> edge case
        }

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
