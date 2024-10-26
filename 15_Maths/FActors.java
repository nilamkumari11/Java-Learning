import java.util.ArrayList;

public class FActors {
    public static void main(String[] args) {
        factors(20);
        System.out.println();
        factors2(20);
    }

    // Now time complexity will be sqrt(n)
    static void factors(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    //we want to print it in sorted order so we willl store the second descending numbers
    //Now both space and time complexity will be sqrt(n)
    static void factors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}
