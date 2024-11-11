package Access;

public class SubClass extends A{
    public SubClass(int num, String name, int roll, int example) {
        super(num, name, roll, example);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Nilam", 67, 90);
        int ex = obj.example; // in subclass of same package accessed ( protected )

        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);
    }
}
