package properties.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override // this is called annotations ( to check whether it is overridden or not)
    void area() {
        System.out.println("Area is pi*r square");
    }
}
