package staticExample;

// outside classes can not be static
public class InnerClasses {

    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("nilam");
        Test b = new Test("Ayushi");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
