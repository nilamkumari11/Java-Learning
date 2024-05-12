package nilam;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,5,6,7,8,9};
        int target = 6;
        int start = 1, end = 5;
        System.out.println(search(arr,target,start,end));
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
