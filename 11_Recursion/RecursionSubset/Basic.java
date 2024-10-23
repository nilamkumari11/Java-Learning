public class Basic {
    public static void main(String[] args) {
        skip("", "baccdah");
        String ans = skip2("baccdah");
        System.out.println(ans);
        String a = "orangeandAppleandbanananApp";
        System.out.println(skipAppNotApple(a));

    }

    static void skip(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
             skip(p, up.substring(1));
        } else {
            skip(p+ch, up.substring(1));
        }
    }

    static String skip2(String up) {
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            return skip2( up.substring(1));
        } else {
            return ch + skip2( up.substring(1));
        }
    }

    static String skipApple(String up) {
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("Apple")) {
            return skipApple( up.substring(5));
        } else {
            return  up.charAt(0) + skipApple( up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if(up.isEmpty()){
            return "";
        }

        if(!up.startsWith("Apple") && up.startsWith("App")) {
            return skipAppNotApple( up.substring(3));
        } else {
            return  up.charAt(0) + skipAppNotApple( up.substring(1));
        }
    }
}
