package nilam;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11,28};
        int target = 12;
        int ans = Search(nums, target);
        System.out.println(ans);
    }

    //search for an index and return item index
    //otherwise return -1
    static int Search(int[] arr, int element){
        if(arr.length ==0){
            return -1;
        }
        for (int row = 0; row < arr.length ; row++) { //length is variable with array
            int num = arr[row];
            if (num == element) {
                return row;
            }
        }
        //this line will execute when no elementfound
        return -1;
    }

}
