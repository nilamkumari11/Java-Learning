public class FindSortedOrNot {
    public static void main(String[] args) {
    int[] arr = {1, 2, 7, 6, 8, 9};
        System.out.println(sortedOrNot(arr));
    }

    static boolean sortedOrNot(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        if(index == arr.length -1) {
            return true;
        }
        return arr[index]<arr[index+1] && helper(arr, index+1);
    }
}
