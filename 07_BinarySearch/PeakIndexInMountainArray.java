package nilam;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 50, 2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1 ;

        while(start != end){
            int mid = start + (end - start)/2 ;

            if(arr[mid] > arr[mid+1]){
                //we are in dec part of array
                //arr[mid] can be the max
                end = mid ;
            }else{
                //we are in inc part of array
                //arr[mid] can not be the max
                start = mid+1;
            }
        }
        //in the end start == end pointing to the largest number
        //start and end both are trying pointing to the max with the two checks
        //More Elaboration : At every point of start and end, they have the best possible answer till that time
        //and if we are saying only one item is remaining, cuz of above lines that is the best possible ans
        return start;
    }

}
