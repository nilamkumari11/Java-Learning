package nilam;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(5);//we wrote datatype in second braket
        //of array list thats noy mandatory this one ^
        //we cant write primitives like int we have to wite RAPPER CLASSES like Integer

        list.add(65);
        list.add(9564);
        list.add(79421);
        list.add(48745);
        list.add(5842);
        list.add(6865);
        System.out.println(list);
        //System.out.println(list.contains(9564));-> return true or false here true
        list.set(0,99); //updates 0th index to 99
        System.out.println(list);
        list.remove(2); //removes index 2
        System.out.println(list);
        //input
        for(int i = 0 ; i<5 ; i++){
            list.add(in.nextInt());
        }
        //get item in any index -> cant take like list[index]
        for(int i = 0 ; i<5 ; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list );

        /*
        how this is internally working ?
        its diefferent from array how can we give size 5 and enteras many input we want.
        actually 1. size is FIXED INTERNAL
        2.Say array list fills by some amount
        ->It will create a NEW ARRAY LIST  of say,double the size
        ->Elements in the old list are copied to new ArrayList
        ->Old array List is Deleted
         */
    }
}
