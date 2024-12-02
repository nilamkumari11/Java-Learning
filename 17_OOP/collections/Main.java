package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(37);

        System.out.println(list2);

        // at a time only one thread can access so slow
        // not so much used
        List<Integer> vector = new Vector<>();
        vector.add(55);
        vector.add(89);

        System.out.println(vector);
    }
}
