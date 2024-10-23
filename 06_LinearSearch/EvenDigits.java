package nilam;

public class EvenDigits {
    public static void main(String[] args) {
    int[] nums = {12,9764,-86,475,2,36987,1};
    int ans = FindNumbers(nums);
        System.out.println(ans);
        System.out.println(digts2(12345));
    }

    static int FindNumbers(int nums[]){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
//shortcut to find num of digits
    static int digts2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }

    //function to check even digits
    static boolean even(int num) {
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            num = 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        //shortcut of if else
        return count % 2 == 0;
    }
}
