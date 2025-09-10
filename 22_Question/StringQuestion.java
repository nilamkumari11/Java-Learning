import java.util.HashMap;

public class StringQuestion {
    public static void main(String[] args) {
        String result = hyphen("abcaba");
        System.out.println(result);
    }

    private static String hyphen(String s){
        HashMap<Character, Integer> index = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(!index.containsKey(s.charAt(i))){
                index.put(s.charAt(i),i+1);
            }
            for(int j=0; j< index.get(s.charAt(i)); j++){
                sb.append(s.charAt(i));
            }
            sb.append("-");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
