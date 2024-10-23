package nilam;

public class CeilingOfNumber {
    //return index of smallest number greater than or equal to target
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 14, 16, 18, 46};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target){
        //if target is greater than the largest number
        if(target > arr[arr.length-1]){
            return - 1;
        }
        int start = 0 ;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start ;
    }
}
