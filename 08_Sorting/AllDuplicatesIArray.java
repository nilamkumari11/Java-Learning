package nilam;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesIArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                list.add(nums[index]);
            }
        }

        return list;
        
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
