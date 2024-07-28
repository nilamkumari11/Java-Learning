public class CountZeroes {
    public static void main(String[] args) {
        int n = 2020000;
        System.out.println(countByMe(n));
        System.out.println(countByKunal(n));
    }

    static int countByMe(int n){
        if(n==0){
            return 0;
        }

        if(n%10 == 0){
            return 1+countByMe(n/10);
        }
        return countByMe(n/10);
    }

    //return same value to above function calls
    static int countByKunal(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }

        int rem = n% 10;
        if( rem == 0){
            return helper(n/10, c+1);
        }

        return helper(n/10, c);
    }
}
