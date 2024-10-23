import java.util.Arrays;

public class CountingBts {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }

    static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0; i<arr.length; i++){
            int count = 0;
            while(i != 0){
                count++;
                i &= (i-1);
            }
            arr[i] = count;
        }
        return arr;
    }
}
