package nilam;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    static  int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            int correct = nums[j]-1;
            if(nums[j] != nums[correct]){
                return nums[j];
            }
        }
        return nums[nums.length-1];
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
