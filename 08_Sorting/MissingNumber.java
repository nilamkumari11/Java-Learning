package nilam;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }

        //case 2
        return nums.length;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
