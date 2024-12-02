package packages.a; //location where file is stored

import static packages.b.Message.message;
// only public will be available

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World");
        message(); // from package b
    }
}
