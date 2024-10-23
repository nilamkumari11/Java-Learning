public class BS {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 56, 89};
        System.out.println(search(arr, 56, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){   // start and end are taken as arguments as they will be required in every pass and will changed
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2 ;

        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            return search(arr, target, s, m-1);      // make sure to return the result of the function call in the return type
        }

        return search(arr, target, m+1, e);
    }
}
