package nilam;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195 -> ASCII value is added
        System.out.println("a" + "b"); //concatenated
        System.out.println((char)('a' + 3)); // d
        System.out.println("a"+1);  // when integer is concatenated to a string it is concerted to
        //its Rapper class Integer that will all toStrings

        System.out.println("Nilam" +  new ArrayList<>());

        //------------*-----------*---------------
        //this is an expression
      //  System.out.println(new Integer(56) + new ArrayList<>());
        // -> this will give error
        //the operator plus in java its only defined for primitives and if any oe value is string

        //in string objects plus operator is overloaded (doesnt works in minus)
        //but this result in poor code thats why java not suports this

    }
}
