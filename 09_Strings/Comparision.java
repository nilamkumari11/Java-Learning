package nilam;

import java.sql.SQLOutput;

public class Comparision {
    public static void main(String[] args) {
        String a = "Nilam";
        String b = "Nilam";
        String c = a;
        System.out.println(a==c); //true
        //this in string pool because the value is same

        //== -> checks if reference variables are pointing to same object
        System.out.println(a==b); //true

        //create different object of same value
        String name1 = new String("Nilam");
        String name2 = new String("Nilam");
        //creating these values outside the pool but in heap
        System.out.println(name1==name2); //false

        //When only need to check value use .equals method
        System.out.println(name1.equals(name2));//true

        //accesing 1 charecter
        System.out.println(name1.charAt(0));//N
    }
}
