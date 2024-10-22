public class HammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x, y));
    }

    static int hammingDistance(int x, int y) {
        if(x == y){
            return 0;
        }
        int count = 0;

        int a = x^y;
        String b = Integer.toBinaryString(a);
        for(int i = 0; i<b.length(); i++){
            if(b.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
