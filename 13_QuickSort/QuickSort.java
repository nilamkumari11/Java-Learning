
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        //low and high are for the part we are working with
        //start and end are for swapping
        int s = low;
        int e = high;
        int m = s+ (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            //also a reason why the if its already sorted it will not swap
            if(s<= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

            //now pivot is at correct index sort the two halves
            sort(arr, low, e);
            sort(arr, s, high);

        }
    }
}
