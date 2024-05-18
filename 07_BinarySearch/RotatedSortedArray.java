package nilam;

public class RotatedSortedArray {
    // if arr = [1, 2, 3, 4, 5] -> then after one rotation
    // arr = [5, 1, 2, 3, 4] -> like this it will continue each rotation
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length-1);

    }

    static int findPivot(int[] nums){
        //maximum number in array
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start)/2 ;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1 ;
            }else if(nums[mid] <= nums[start]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivotForDuplicateValue(int[] nums){
        int start = 0 ;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            //if elements at middle start and end are equal the skip the duplicates

            if(nums[mid] == nums[start] && nums[mid] == nums[end]){

                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;

                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side sorted now check in right side
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1 ;
            }

        }
        return -1;
    }

}
