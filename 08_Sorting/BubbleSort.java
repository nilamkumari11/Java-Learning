package nilam;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps N-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the end
            for (int j = 1; j <= arr.length - i -1; j++) {
                //swap if the item is smaller than previous item

                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if you have not swapped for a perticular value of i it means array is sorted-> break

            if(!swapped){
                break;
            }
        }
    }
}
