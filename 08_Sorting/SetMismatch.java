package nilam;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[]  nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int[] list = new int[2];
        int i = 0;
        while(i< nums.length){
            int correct = nums[i]-1;

            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {

            if(nums[index] != index+1){
                list[0] = nums[index];
                list[1] = index+1;
            }
        }
        return list;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
