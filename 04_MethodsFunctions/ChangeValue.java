package com.nilam;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 3, 2, 45, 6}; //arr is pointing to the values
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
/*
in case of strings it was not modified it was just creating a new object
in case of arrays it is modifying
strings are immutable and thats why it was not changed in the main but arr it is changed
 */
    static void change(int[] nums){ //nums is also pointing to same valuea
        nums[0] = 99 ; //it also changes the value of arr
        //if you make any change in this object bye reference variable same object will be chnaged
    }
}
