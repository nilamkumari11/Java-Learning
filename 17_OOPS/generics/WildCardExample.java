package generics;

import properties.polymorphism.Numbers;

import java.util.Arrays;
import java.util.List;

// here T should be either number or its subClasses
public class WildCardExample<T extends Number> {
    // instance variables
    private Object[] data;
    private static int DEFAULT_SIZE= 10;
    private int size = 0; // also working as index value

    public WildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }

//    public void getList(List<Number> list){
//        // do something
//
//        // here you can only pass Number type
//    }

    public void getList(List<? extends Number> list){
        // do something

        // here you can pass Number and its sub class
    }


    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for( int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardExample<Integer> list = new WildCardExample<>();
        for(int i = 0; i < 14; i++) {
            list.add(i*2);
        }
        System.out.println(list);

        // now string can not be added

    }
}
