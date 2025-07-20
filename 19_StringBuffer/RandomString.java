import java.util.Random;

public class RandomString {
    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();
        for(int i=0; i< size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int n =20;
        String name = RandomString.generate(n);
        System.out.println(name);
    }
}

