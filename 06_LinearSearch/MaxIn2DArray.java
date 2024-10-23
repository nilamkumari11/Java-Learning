package nilam;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,39,34,56},
                {18,12}
        };
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE); //min valu that it can hold

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE; //min value an int can hold
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
