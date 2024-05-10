package nilam;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,56,43,21};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("After Swapinf Index 1 and 3 :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reverse of Array :");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int index1 ,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    //two pointer method
    static void reverse(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
