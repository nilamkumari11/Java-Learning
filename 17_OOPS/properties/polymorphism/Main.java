package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square(); // access the object here
        // what it is able to access is defined by the type of reference
        // which one it is able to access is defined by type of object (upcasting)

        square.area();
    }
}
