public class Fibo {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        //can also use long for bigger numbers
        return (int)(Math.pow(((1+Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    //it will not give for 50 as it uses recursion and same function is called again and again so cant be used here
}
