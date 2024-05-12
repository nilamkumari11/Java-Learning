package nilam;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,98,-58, 69,-78, -85};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
