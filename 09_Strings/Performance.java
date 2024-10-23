package nilam;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch);
            series = series+ch;
            //new object is created everytime -> memory wastage
            //StringBuilder is seperate class we will use
        }

        System.out.println(series);
    }
}
