import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // large String
        // StringBuffer -> mutable seq of charecters
        // adv over string
        //  1.mutable
        // 2. efficient - doesnt make objects again and again
        // 3. thread safe (it makes it slower)
        // string builder is not thread safe (so when not working with multiple threads and faster use this )
        // thread -> small unit of processes
        // if thread 1 and thread 2 both are working on same object
        // then thread1 while working on that data, it will not allow thread2 to work on it

        // constructor 1
        StringBuffer sb = new StringBuffer(); // empty
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Nilam Kumari"); // given string

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30); // empty string capacity
        System.out.println(sb.capacity());
        sb.append("WeMakeDevs");
        sb.insert(2, " rahul ");
        sb.replace(1,5, "Kumari"); // index 1 to 4 will be replaced by this
        sb.delete(1,5);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        Random random = new Random();
        System.out.println(random.nextFloat());

        System.out.println((char)(97 ));

        // remove white spaces
        String sentence = "hi   his        ljkhgbfiqua            n";

        System.out.println(sentence.replaceAll("\\s", "")); // replace space with nothing

        // split
        String arr = "Nilam Riya Jiya";
        String[] s = arr.split(" ");

        System.out.println(Arrays.toString(s));

        //rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}