package nilam;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Nilam Kumari Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("      Nilam  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
