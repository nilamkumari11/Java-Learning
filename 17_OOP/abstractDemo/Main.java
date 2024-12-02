package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(30);
        daughter.career();
        daughter.partner();

//        Parent mom = new Parent() ;
        // can not create objects of abstract class

        Parent.hello();
        son.normal();
    }
}
