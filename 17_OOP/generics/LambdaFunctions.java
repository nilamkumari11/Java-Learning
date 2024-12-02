package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    // one line functions
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

//        arr.forEach((item) -> {System.out.println(item+2);});

        Consumer<Integer> fun = (item) -> System.out.println(item+2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a+b;
        Operation pro = (a,b) -> a*b;
        Operation dif = (a, b) -> a-b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, pro));
        System.out.println(myCalc.operate(5, 3, dif));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }
}

interface Operation {
    //abstract method
    int operation(int a, int b);
}
