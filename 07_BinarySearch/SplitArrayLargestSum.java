package nilam;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0 ;
        int end = 0 ;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of loop this will contain the max of the array
            end += nums[i];
        }

        //binary search
        while (start < end){
            //potential ans will be middle
            int mid = start + (end - start)/2;

            //calc how many peices we can divide this into with this max sum
            int sum = 0 ;
            int pieces = 1;
            for (int num : nums) {
                if(sum + num > mid){
                    //we can not add this in this subarray, make new array
                    //after you add this num in new subarray, then sum = num
                    sum = num;
                    pieces ++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }

        }

        return start; // start == end
    }

}
