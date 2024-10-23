public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palindrome2(n));
    }

    static boolean palindrome(int n) {
        int digits = (int)(Math.log10(n))+1;
        if(n == helper(n, digits)){
            return true;
        }else{
            return false;
        }
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){ // 1 digit num
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static boolean palindrome2(int n) {
        String num = Integer.toString(n);
        return helper2(num, 0, num.length()-1);
    }

    private static boolean helper2(String num, int start, int end) {

        if(start >= end){
            return true;
        }

        if(num.charAt(start) == num.charAt(end)){
            return helper2(num, start+1, end-1);
        }

        return false;
    }
}
