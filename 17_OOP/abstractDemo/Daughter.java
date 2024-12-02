package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be Coder" );
    }

    @Override
    void partner() {
        System.out.println("I love Ram he is  " + age);
    }
}
