package nilam;

import java.util.Arrays;

public class SearchInSrings {
    public static void main(String[] args) {
        String name = "Nilam";
        char target = 'a';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray())); //gives charecter array
    }

    static boolean search2(String name, char target){
        if(name.length() == 0){ //here length () bcause its a function
            return false;
        }
        char[] charArray = name.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch == target) {
                return true;
            }
        }
        return false;

    }

    static boolean search(String name, char target){
        if(name.length() == 0){ //here length () bcause its a function
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
